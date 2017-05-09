package trader;

import java.util.ArrayList;

import java.util.Random;

import supplier.*;
import tradingObject.*;

public class SoleTrader extends Trader {

	private ArrayList<RetailSupplier> suppliers = new ArrayList<>();
	public ITradingObjects tradingObject;

	public SoleTrader(String name, ArrayList<Supplier> suppliers) {
		super(name);
		this.money = 500.00f;
		int numberOfSuppliers = new Random().nextInt(4) + 2;
		for (int i = 0; i < suppliers.size(); i++) {
			if (this.suppliers.size() == numberOfSuppliers) {
				break;
			}
			if (suppliers.get(i) instanceof RetailSupplier) {
				this.suppliers.add((RetailSupplier) suppliers.get(i));
				suppliers.remove(i);
			}
		}
	}

	@Override
	public void makeOrder() {
		float moneyToSpend = this.money / 2;
		
		while (moneyToSpend >= 15) {
			// add products to supplier if necessary
			Supplier currentSupplier = this.suppliers.get(new Random().nextInt(this.suppliers.size()));
			int index = currentSupplier.getProducts().size() - 1;
			if (currentSupplier.getProducts().size() < 2) {
				currentSupplier.addProducts();
			}
			// buy products and sort by price
			if(this.tradingObject.getProducts().size() == 0){
				this.tradingObject.getProducts().add(currentSupplier.getProducts().get(index));
				this.tradingObject.getProducts().get(0).setPrice(currentSupplier);
			}
			else{
				for (int i = 0; i < this.tradingObject.getProducts().size(); i++) {
					if (currentSupplier.getProducts().get(index).price <= this.tradingObject.getProducts().get(i).price) {
						this.tradingObject.getProducts().add(i, currentSupplier.getProducts().get(index));
						this.tradingObject.getProducts().get(i).setPrice(currentSupplier);
						break;
					} else if (i == this.tradingObject.getProducts().size() - 1) {
						this.tradingObject.getProducts().add(currentSupplier.getProducts().get(index));
						this.tradingObject.getProducts().get(i).setPrice(currentSupplier);
						break;
					}
				}
			}
			//check discount, regulate money
			this.money -= (currentSupplier.getProducts().get(index).price 
					    - currentSupplier.getProducts().get(index).price * currentSupplier.getDiscount());
			moneyToSpend -= (currentSupplier.getProducts().get(index).price 
					      - currentSupplier.getProducts().get(index).price * currentSupplier.getDiscount());
			currentSupplier.getProducts().remove(index);
		}
		// print products
		System.out.println("'Sole trader' products in shop: ");
		for (int i = 0; i < this.tradingObject.getProducts().size(); i++) {
			System.out.println(this.tradingObject.getProducts().get(i).name + " - "
					+ this.tradingObject.getProducts().get(i).price);
		}
		System.out.println();
	}

	@Override
	public void addTurnoverToMoney() {
		float turnover = 0.0f;
		float profit = 0.0f;
		int numberOfProductsSold = new Random().nextInt(this.tradingObject.getProducts().size());
		for (int i = 0; i < numberOfProductsSold; i++) {
			int index = new Random().nextInt(this.tradingObject.getProducts().size());
			turnover += this.tradingObject.getProducts().get(index).price 
					 + this.tradingObject.getProducts().get(index).price * this.profitPercentage;
			profit += this.tradingObject.getProducts().get(index).price * this.profitPercentage;
			this.tradingObject.getProducts().remove(index);
		}
		System.out.println("Number of products sold: " + numberOfProductsSold);
		System.out.println("Dayly profit: " + profit);
		this.numberOfProductsSold += numberOfProductsSold;
		this.money += turnover;
	}

	@Override
	public int getNumberOfProductsSold() {
		return this.numberOfProductsSold;
	}

	@Override
	public void payTax() {
		this.money -= this.tradingObject.getTax() / 365;
		System.out.println("Tax payed: " + this.tradingObject.getTax() / 365);

	}

}

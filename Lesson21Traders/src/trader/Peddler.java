package trader;

import java.util.ArrayList;
import java.util.Random;
import supplier.*;

public class Peddler extends Trader {

	private RetailSupplier supplier;
	private ArrayList<Product> products = new ArrayList<>();

	
	public Peddler(String name, ArrayList suppliers) {
		super(name);
		this.money = 100.00f;
		while (this.supplier == null) {
			Random r = new Random();
			int index = r.nextInt(suppliers.size());
			if (suppliers.get(index) instanceof RetailSupplier) {
				this.supplier = (RetailSupplier) suppliers.get(index);
				suppliers.remove(index);
			}
		}
	}

	
	@Override
	public void makeOrder() {
		float moneyToSpend = this.money / 2;
		while (moneyToSpend >= 15) {
			
			//add products to supplier if necessary
			int index = this.supplier.getProducts().size() - 1;
 			if (supplier.getProducts().size() < 2) {
				supplier.addProducts();
			}
			// buy products and sort by price
			if(this.products.size() == 0){
				this.products.add(this.supplier.getProducts().get(index));
				this.products.get(0).setPrice(this.supplier);
			}
			else{
				for (int i = 0; i < this.products.size(); i++) {
					if (this.supplier.getProducts().get(index).price <= this.products.get(i).price) {
						this.products.add(i, this.supplier.getProducts().get(index));
						this.products.get(i).setPrice(this.supplier);
						break;
					} else if (i == this.products.size() - 1) {
						this.products.add(this.supplier.getProducts().get(index));
						this.products.get(i).setPrice(this.supplier);
						break;
					}
				}
			}
			// check discount, regulate money
			this.money -= (this.supplier.getProducts().get(index).price 
					    - this.supplier.getProducts().get(index).price * this.supplier.getDiscount());
			moneyToSpend -= (this.supplier.getProducts().get(index).price 
					      - this.supplier.getProducts().get(index).price * this.supplier.getDiscount());
			this.supplier.getProducts().remove(index);
		}
		System.out.println("'Peddler' products: ");
		for (int i = 0; i < this.products.size(); i++) {
			System.out.println(this.products.get(i).name + " - " + this.products.get(i).price);
		}
		System.out.println();

	}

	
	@Override
	public void addTurnoverToMoney() {
		float turnover = 0.0f;
		float profit = 0.0f;
		int numberOfProductsSold = new Random().nextInt(this.products.size());
		for (int i = 0; i < numberOfProductsSold; i++) {
			int index = new Random().nextInt(this.products.size());
			turnover += (this.products.get(index).price + this.products.get(index).price * profitPercentage);
			profit += (this.products.get(index).price * this.profitPercentage);
			this.products.remove(index);
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
		System.out.println("No tax due to be paid");
	}

}
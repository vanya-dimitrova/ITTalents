package trader;

import java.util.ArrayList;
import java.util.Random;
import supplier.Supplier;
import tradingObject.ITradingObjectsShopChain;


public class ShopChain extends Trader {

	private ArrayList<Supplier> suppliers = new ArrayList<>();
	public ArrayList<ITradingObjectsShopChain> tradingObjects = new ArrayList<>();

	public ShopChain(String name, ArrayList<Supplier> suppliers, ArrayList tradingObjects) {
		super(name);
		this.money = 3000.00f;
		int numberOfSuppliers = new Random().nextInt(14) + 2;
		for (int i = 0; i < suppliers.size(); i++) {
			if ((this.suppliers.size() == numberOfSuppliers)) {
				break;
			}
			this.suppliers.add(suppliers.get(i));
			suppliers.remove(i);
		}

	}

	@Override
	public void makeOrder() {
		// for each shop
		for (int i = 0; i < this.tradingObjects.size(); i++) {
			ITradingObjectsShopChain currentTradingObject = this.tradingObjects.get(i);
			float moneyToSpend = this.money / this.tradingObjects.size() / 2;
			
			while (moneyToSpend >= 15) {
				// add products to supplier if necessary
				Supplier currentSupplier = this.suppliers.get(new Random().nextInt(this.suppliers.size()));
				int index = currentSupplier.getProducts().size() - 1;
				if (currentSupplier.getProducts().size() < 2) {
					currentSupplier.addProducts();
				}
				// buy products and sort by price
				if(currentTradingObject.getProducts().size() == 0){
					currentTradingObject.getProducts().add(currentSupplier.getProducts().get(index));
					currentTradingObject.getProducts().get(0).setPrice(currentSupplier);
				}
				else{
					for (int j = 0; j < currentTradingObject.getProducts().size(); j++) {
						if (currentSupplier.getProducts().get(index).price <= currentTradingObject.getProducts().get(j).price) {
							currentTradingObject.getProducts().add(j, currentSupplier.getProducts().get(index));
							currentTradingObject.getProducts().get(j).setPrice(currentSupplier);
							break;
						} else if (j == currentTradingObject.getProducts().size() - 1) {
							currentTradingObject.getProducts().add(currentSupplier.getProducts().get(index));
							currentTradingObject.getProducts().get(j).setPrice(currentSupplier);
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
			System.out.println("'Chain shops' products in shop " + i + ": ");
			for (int j = 0; j < currentTradingObject.getProducts().size(); j++) {
				System.out.println(currentTradingObject.getProducts().get(j).name + " - "
						+ currentTradingObject.getProducts().get(j).price);
			}
			System.out.println();
		}
	}

	
	@Override
	public void addTurnoverToMoney() {
		for (int i = 0; i < this.tradingObjects.size(); i++) {
			ITradingObjectsShopChain currentTradingObject = this.tradingObjects.get(i);
			float turnover = 0.0f;
			float profit = 0.0f;
			int numberOfProductsSold = new Random().nextInt(currentTradingObject.getProducts().size());
			for (int j = 0; j < numberOfProductsSold; j++) {
				int index = new Random().nextInt(currentTradingObject.getProducts().size());
				turnover += currentTradingObject.getProducts().get(index).price 
						 +currentTradingObject.getProducts().get(index).price * this.profitPercentage;
				profit += currentTradingObject.getProducts().get(index).price * this.profitPercentage;
				currentTradingObject.getProducts().remove(index);
			}
			System.out.println("Number of products sold: " + numberOfProductsSold);
			System.out.println("'Chain shops' daily profit shop " + i + ": " + profit);
			this.numberOfProductsSold += numberOfProductsSold;
			this.money += turnover;
		}
	}
	
	@Override
	public int getNumberOfProductsSold() {
		return this.numberOfProductsSold;
	}

	@Override
	public void payTax() {
		for (int i = 0; i < this.tradingObjects.size(); i++) {
			this.money -= this.tradingObjects.get(i).getTax() / 365;
			System.out.println("Tax payed: " + this.tradingObjects.get(i).getTax() / 365);
		}
	}

	

}

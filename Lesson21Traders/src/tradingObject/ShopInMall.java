package tradingObject;

import java.util.ArrayList;

import supplier.Product;

public class ShopInMall extends TradingObject implements ITradingObjectsShopChain{
	
	public ShopInMall(String address, int workingHours, int area) {
		super(address, workingHours);
		this.tax = 150;
		if(area >=10 && area <= 100){
			this.area = area;
		}
		else{
			throw new IllegalArgumentException("Invalid input! Object is not created!");
		}
	}

	@Override
	public void setTax(int tax) {
		this.tax = 150;
		
	}

	@Override
	public double getTax() {
		return this.tax;
	}
	

	@Override
	public ArrayList<Product> getProducts() {
		return this.products;
	}






}

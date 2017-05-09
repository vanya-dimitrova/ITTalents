package tradingObject;

import java.util.ArrayList;

import supplier.Product;

public class MarketTable extends TradingObject implements ITradingObjects{
	
	public MarketTable(String address, int workingHours, int area){
		super(address, workingHours);
		this.tax = 50;
		if(area >=2 && area <= 10){
			this.area = area;
		}
		else{
			throw new IllegalArgumentException("Invalid input! Object is not created!");
		}
	}

	@Override
	public void setTax(int tax) {
		this.tax = 50;
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

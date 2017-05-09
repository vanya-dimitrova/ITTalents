package tradingObject;


import java.util.ArrayList;

import supplier.Product;

abstract public class TradingObject {
	
	private String address;
	private int workingHours;
	protected int area;
	protected double tax;
	ArrayList<Product> products;
	
	TradingObject(String address, int workingHours){
		if(address != null && !address.isEmpty() 
		   && workingHours >0 && workingHours <= 10){
			this.address = address;
			this.workingHours = workingHours;
			this.products = new ArrayList<>();
		}
	}
	
	
			
	

	

	

}

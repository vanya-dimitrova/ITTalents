package torti;

import java.util.ArrayList;

public class Order {
	
	private int price;
	private String address;
	private ArrayList<Cake> cakes;
	private String deliverydate;
	

	public Order(String address, String deliverydate) {
		this.address = address;
		this.cakes = new ArrayList();
		this.deliverydate = deliverydate;
	}
	
	public int getPrice() {
		return price;
	}

	public ArrayList<Cake> getCakes() {
		return cakes;
	}

}

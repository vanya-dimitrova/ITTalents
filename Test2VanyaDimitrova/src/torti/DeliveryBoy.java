package torti;

import java.util.HashMap;

public class DeliveryBoy implements Comparable<DeliveryBoy>{
	
	private String name;
	private String telNumber;
	private int money;
	private HashMap<String, Order> ordersToDeliver;
	
	
	public DeliveryBoy(String name, String telNumber) {
		this.name = name;
		this.telNumber = telNumber;
		this.ordersToDeliver = new HashMap<>();
	}
	
	void makeDelivery(){
		//TODO
	}


	@Override
	public int compareTo(DeliveryBoy o) {
		return o.money - this.money;
	}
	
	
	
}

package torti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

import torti.Cake.CakeSort;
import torti.KidsCake.CakeType;

public class PasteryShop {
	
	private String name;
	private String address;
	private String telNumber;
	private int money;
	private HashMap<CakeSort, TreeMap<CakeType, Integer>> catalog;
	private TreeSet<DeliveryBoy> deliveryboys;
	private ArrayList<Client> clients;
	
	
	public PasteryShop(String name, String address, String telNumber) {
		this.name = name;
		this.address = address;
		this.telNumber = telNumber;
		this.catalog = new HashMap<>();
		this.deliveryboys = new TreeSet<>();
		this.clients = clients = new ArrayList<>();
	}
	
	void showCatalog(){
		//TODO
	}
	
	void showMoney(){
		System.out.println("Turnover at the moment in the pastery shop: " + this.money);
	}
	
	void showInfoDeliveryBoys(){
		//TODO
	}
	
	void showBestSalesCake(){
		//TODO
	}
	
	void showBestDeliveryBoy(){
		//TODO
	}
	
	void showBestClient(){
		//TODO
	}


	public void setDeliveryboys(DeliveryBoy deliveryboy) {
		this.deliveryboys.add(deliveryboy);
	}

	public int getMoney() {
		return money;
	}

	


	
	


}

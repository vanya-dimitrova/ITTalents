package supplier;

import java.util.ArrayList;
import java.util.Random;

public abstract class Supplier {

	protected String name;
	protected String address;
	private int workingHours;
	protected float discount;
	protected ArrayList<Product> products;
	protected int maxProducts;

	Supplier(String name) {
		this.address = "Sofia";
		this.workingHours = 8;
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} 
		else {
			throw new IllegalArgumentException("Invalid input! Object is not created!");
		}
	}
	
	public ArrayList<Product> getProducts(){
		return this.products;
	}
	
	public float getDiscount(){
		return this.discount;
	}
	
	public void addProducts(){
		Product socks = new Product("socks", 5.50f);
		Product scarf = new Product("scarf", 10.50f);
		Product hat = new Product("hat", 12.50f);
		Product gloves = new Product("gloves", 9.99f);
		Product tshirt = new Product("t-shirt", 15.00f);
		Product stockings = new Product("stockings", 6.00f);
		Product panties = new Product("panties", 5.00f);
		Product sweatshirt = new Product("sweatshirt", 14.99f);
		Product skirt = new Product("skirt", 15.00f);
		Product pants = new Product("pants", 15.00f);
		
		for (int i = 0; i < this.maxProducts; i++) {
			switch(new Random().nextInt(10)){
			case 0:
				this.products.add(socks);
				break;
			case 1:
				this.products.add(scarf);
				break;
			case 2:
				this.products.add(hat);
				break;
			case 3:
				this.products.add(gloves);
				break;
			case 4:
				this.products.add(tshirt);
				break;
			case 5:
				this.products.add(stockings);
				break;
			case 6:
				this.products.add(panties);
				break;
			case 7:
				this.products.add(sweatshirt);
				break;
			case 8:
				this.products.add(skirt);
				break;
			case 9:
				this.products.add(pants);
				break;
			}
		}
		
	}
	

}

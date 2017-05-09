package shopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Map.Entry;


import shopping.Client.Product.ProductName;

public class Client {

	static class Product {

		enum ProductName {
			ORANGE("Fruit"), BANANA("Fruit"), APPLE("Fruit"), PATATO("Vegetable"), EGGPLANT("Vegetable"), CUCUMBER(
					"Vegetable"), PORK("Meat"), BEEF("Meat"), CHICKEN("Meat");

			String type;

			private ProductName(String type) {
				this.type = type;
			}
		}

		private ProductName name;
		private int quantity;

		public Product(ProductName name) {
			this.name = name;
			this.quantity = 0;
		}
		
		@Override
		public String toString() {
			return this.name + "-" + this.quantity;
		}

	}

	static class Supplier {

		private String name;

		Supplier(String name) {
			if (name != null && !name.isEmpty())
				this.name = name;
		}

		private void deliverInWareHouse(WareHouse wareHouse) {
			for (Iterator<ArrayList<Product>> it = wareHouse.products.values().iterator(); it.hasNext();) {
				for (int i = 0; i < it.next().size(); i++) {
					if (it.next().get(i).quantity < 4) {
						it.next().get(i).quantity += 25;
					}
				}
			}
		}
	}

	static class WareHouse {

		private static final int MIN_QUANTITY_PER_PRODUCT = 15;
		private HashMap<String, ArrayList<Product>> products;
		private Supplier supplier;

		public WareHouse(Supplier supplier) {
			this.supplier = supplier;
			this.products = new HashMap<>();
			products.put("Fruit", new ArrayList<>());
			products.put("Meat", new ArrayList<>());
			products.put("Vegetable", new ArrayList<>());
			products.get("Fruit").add(new Product(ProductName.ORANGE));
			products.get("Fruit").add(new Product(ProductName.BANANA));
			products.get("Fruit").add(new Product(ProductName.APPLE));
			products.get("Vegetable").add(new Product(ProductName.PATATO));
			products.get("Vegetable").add(new Product(ProductName.EGGPLANT));
			products.get("Vegetable").add(new Product(ProductName.CUCUMBER));
			products.get("Meat").add(new Product(ProductName.PORK));
			products.get("Meat").add(new Product(ProductName.BEEF));
			products.get("Meat").add(new Product(ProductName.CHICKEN));
			for (Iterator<ArrayList<Product>> it = this.products.values().iterator(); it.hasNext();) {
				ArrayList<Product> p = it.next();
				System.out.println(p);
				System.out.println();
				for (int i = 0; i < p.size(); i++) {
					System.out.println(p.get(i));
					p.get(i).quantity += MIN_QUANTITY_PER_PRODUCT;
				}
			}
		}

		private void deliverInShop(Shop shop, ProductName name, int quantity) {
			for (int i = 0; i < this.products.get(name.type).size(); i++) {
				Product productToTakeOut = this.products.get(name.type).get(i);
				if (productToTakeOut.name == name) {
					if (productToTakeOut.quantity < quantity + WareHouse.MIN_QUANTITY_PER_PRODUCT) {
						this.getProductsIn(this.supplier);
						productToTakeOut.quantity -= this.MIN_QUANTITY_PER_PRODUCT;
					}
				}
			}
			for (int i = 0; i < shop.products.get(name.type).size(); i++) {
				Product productToGet = shop.products.get(name.type).get(i);
				if (productToGet.name == name) {
					productToGet.quantity += shop.getMIN_QUANTITY_PER_PRODUCT();
				}
			}
		}

		private void getProductsIn(Supplier supplier) {
			this.supplier.deliverInWareHouse(this);
		}
	}

	static class Shop {

		private static final int MIN_QUANTITY_PER_PRODUCT = 12;
		HashMap<String, ArrayList<Product>> products;
		private WareHouse wareHouse;
		private String name;
		private Client clientOne;
		private Client clientTwo;
		private Client clientThree;

		public Shop(String name) {
			if (name != null && !name.isEmpty()) {
				this.name = name;
				this.wareHouse = new WareHouse(new Supplier("Supplier"));
				this.products = new HashMap<>();
				products.put("Fruit", new ArrayList<>());
				products.get("Fruit").add(new Product(ProductName.ORANGE));
				products.get("Fruit").add(new Product(ProductName.BANANA));
				products.get("Fruit").add(new Product(ProductName.APPLE));
				products.put("Vegetable", new ArrayList<>());
				products.get("Vegetable").add(new Product(ProductName.PATATO));
				products.get("Vegetable").add(new Product(ProductName.EGGPLANT));
				products.get("Vegetable").add(new Product(ProductName.CUCUMBER));
				products.put("Meat", new ArrayList<>());
				products.get("Meat").add(new Product(ProductName.PORK));
				products.get("Meat").add(new Product(ProductName.BEEF));
				products.get("Meat").add(new Product(ProductName.CHICKEN));
				for (Iterator<ArrayList<Product>> it = products.values().iterator(); it.hasNext();) {
					ArrayList<Product> p = it.next();
					for (int i = 0; i < p.size(); i++) {
						p.get(i).quantity += MIN_QUANTITY_PER_PRODUCT;
					}
				}
			}
		}
		
		public static int getMIN_QUANTITY_PER_PRODUCT() {
			return MIN_QUANTITY_PER_PRODUCT;
		}

		public static void main(String[] args) {
			
		}
		
		public Client getClientOne() {
			return clientTwo;
		}

		public void setClientOne(Client client) {
			if(client != null)
			this.clientOne = client;
		}
		
		public Client getClientTwo() {
			return clientTwo;
		}

		public void setClientTwo(Client client) {
			if(client != null)
			this.clientTwo = client;
		}

		public Client getClientThree() {
			return clientThree;
		}

		public void setClientThree(Client client) {
			if(client != null)
			this.clientThree = client;
		}
		

		private void checkProduct(ProductName name, int quantity) {
			for (int i = 0; i < this.products.get(name.type).size(); i++) {
				Product productToCheck = this.products.get(name.type).get(i);
				if (productToCheck.name == name && productToCheck.quantity < this.MIN_QUANTITY_PER_PRODUCT) {
					this.wareHouse.deliverInShop(this, name, quantity);
				}
			}
		}
		
		@Override
		public String toString() {
			for(Iterator<Entry<String, ArrayList<Product>>> it = this.products.entrySet().iterator(); it.hasNext();){
				Entry<String, ArrayList<Product>> e = it.next();
				System.out.println("-----------"+ e + "-----------");
			}
			return "-----------";
		}

	}

	private String name;

	Client(String name) {
		if (name != null && !name.isEmpty())
			this.name = name;
	}

	void buyProduct(Shop shop, ProductName name, int quantity) {
		shop.checkProduct(name, quantity);
		for (int i = 0; i < shop.products.get(name.type).size(); i++) {
			Product productToSell = shop.products.get(name.type).get(i);
			if (productToSell.name == name) {
				productToSell.quantity -= quantity;
			}
		}
	}

}

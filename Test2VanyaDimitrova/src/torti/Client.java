package torti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public abstract class Client {
	
	static class PrivateClient extends Client{
		
		private int voucher;

		public PrivateClient(String name, String telNumber, int voucherNumber) {
			super(name, telNumber);
			this.voucher = voucherNumber * (new Random().nextInt(30) + 11);
			
		}

		@Override
		void makeOrder(HashMap catalog) {
			// TODO Auto-generated method stub
			
		}

		public int getVoucher() {
			return voucher;
		}

		@Override
		void acceptOrder(DeliveryBoy deliveryBoy) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	static class CorporateClient extends Client{
		
		public int getDiscountPercent() {
			return discountPercent;
		}

		private int discountPercent;

		public CorporateClient(String name, String telNumber, int discountPercent) {
			super(name, telNumber);
			this.discountPercent = discountPercent;
		}

		@Override
		void makeOrder(HashMap catalog) {
			// TODO Auto-generated method stub
			
		}

		@Override
		void acceptOrder(DeliveryBoy deliveryBoy) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	private String name;
	private String telNumber;
	private ArrayList<Order> order;
	
	public String getName() {
		return name;
	}

	public ArrayList<Order> getOrder() {
		return order;
	}

	public Client(String name, String telNumber) {
		this.name = name;
		this.telNumber = telNumber;
		this.order = new ArrayList<>();
	}
	
	abstract void makeOrder(HashMap catalog);
	
	abstract void acceptOrder(DeliveryBoy deliveryBoy);
	

}

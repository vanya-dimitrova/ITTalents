package demo;

import java.util.ArrayList;

import supplier.RetailSupplier;
import supplier.Supplier;
import trader.Peddler;

public class Demo {

	public static void main(String[] args) {
		RetailSupplier a = new RetailSupplier("HG");
		ArrayList<Supplier> c = new ArrayList<>();
		c.add(a);
		Peddler b = new Peddler("KH", c);
		
		b.makeOrder();
		b.addTurnoverToMoney();
				
				
				
				
		}
		

}

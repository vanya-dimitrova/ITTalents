package supplier;

import java.util.ArrayList;

public class RetailSupplier extends Supplier {
	
	public RetailSupplier(String name){
		super(name);
		this.discount = 0.00f;
		this.maxProducts = 20;
		this.products = new ArrayList<>(this.maxProducts);
		this.addProducts();
	}

	
		

}

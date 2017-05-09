package supplier;

import java.util.ArrayList;

public class WholeSaleSupplier extends Supplier {
	
	public WholeSaleSupplier(String name){
		super(name);
		this.discount = 0.15f;
		this.maxProducts = 50;
		this.products = new ArrayList<>(this.maxProducts);
		this.addProducts();
		
	}

		
		

}

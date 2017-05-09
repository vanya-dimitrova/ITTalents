package supplier;

public class Product {
	
	public final String name;
	public float price;
	
	public Product(String name, float price){
		if(!(name == null) && !name.isEmpty()){
			this.name = name;
			this.price = price;
		}else{
			throw new IllegalArgumentException("Invalid input! Object is not created!");
		}
	}
	
	public void setPrice(Supplier supplier){
		if(supplier.discount > 0){
			this.price -= this.price * supplier.discount;
		}
	}
	
	
	
	

}

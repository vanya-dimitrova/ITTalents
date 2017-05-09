package Computer;

public class CompareComputers {

	public static void main(String[] args) {
		// compare computers
		
		Computer acer = new Computer();
		acer.price = 499.99;
		Computer hp = new Computer(2012, 399.99, 4, "GB", 512, "MB");
		hp.isNotebook = false;
		Computer toshiba = new Computer(2016, 1099.99, true, 500,"GB", 4, "GB", "Linux");
		
		
		
		if(hp.comparePrice(toshiba) > 0){
			System.out.println("Toshiba is more expensive than HP!");
		}
		else if(hp.comparePrice(toshiba) < 0){
			System.out.println("HP is more expensive than Toshiba!");
		}else{
			System.out.println("Equal prices!");
		}
		
		
		
		
		
		
		

	}

}

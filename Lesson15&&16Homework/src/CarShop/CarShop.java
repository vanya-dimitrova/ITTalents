package CarShop;

public class CarShop {
	
	private Car[] cars;
	private Car nextCar;
	Person buyer;

	
	
	CarShop(int capacity){
		this.cars = new Car[capacity];
	}
	
	boolean addCar(Car car){
		for (int i = 0; i < cars.length; i++) {
			if(this.cars[i] == null){
				this.cars[i] = car;
				return car.isCarInShop = true;
			}
		}
		return car.isCarInShop = false;
	}
	
	Car getNextCar(){
		for (int i = 0; i < cars.length; i++) {
			if(this.cars[i] != null){
				return this.nextCar  = this.cars[i];
			}
		}
		System.out.println("There is no car to buy from the shop.");
		return this.nextCar = null;
	}
	
	void sellNextCar(Person buyer){
		if(this.nextCar != null){
		   this.buyer = buyer;
		   this.nextCar.owner = this.buyer;
		}else{
			System.out.println("You can't sell!");
		}
	}
	
	boolean removeCar(Car car){
		for (int i = 0; i < cars.length; i++) {
			if(car == this.cars[i]){
				this.cars[i] = null;
			}
		}
		return car.isCarInShop = false;
	}
	
	void showAllCarsInShop(){
		for (int i = 0; i < cars.length; i++) {
       		if(this.cars[i] != null){
       			System.out.println(this.cars[i].model+"; "+this.cars[i].colour+"; max speed "+this.cars[i].maxSpeed+
       					" km/h; available in shop: "+(this.cars[i].isCarInShop? true : "Sold to "+this.cars[i].owner.name));
       		}
	    }
	}
	
	
	

}

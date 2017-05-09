package CarShop;

public class Car {
	
	String model;
	int maxSpeed;
	int currentSpeed;
	String colour;
	int currentGear;
	Person owner = new Person();
	boolean isCarInShop;
	
	
	void accelarate(){
		if(currentSpeed < maxSpeed){
			currentSpeed++;
		}
	}
	
	void changeGearUp(){
		if(currentGear < 5){
			currentGear++;
		}
	}
	
	void changeGearDown(){
		if(currentGear > 1){
			currentGear--;
		}
	}
	
	void changeGear(int nextGear){
		if(nextGear >= 1 &&  nextGear <= 5
				&& (currentGear - nextGear) == 1 ||(currentGear - nextGear) == -1){
			currentGear++;
		}
	}
	
	void changeColour(String newColour){
		if(newColour != null){
			colour = newColour;
		}
	}
	
	
	

}

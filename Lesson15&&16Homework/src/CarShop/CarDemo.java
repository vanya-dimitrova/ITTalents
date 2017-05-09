package CarShop;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car ford = new Car();
		ford.colour = "Black";
		ford.currentGear = 1;
		ford.currentSpeed = 20;
		ford.maxSpeed = 220;
		ford.model = "Ford Fiesta";
		ford.owner.age = 25;
		ford.owner.name = "Ginka";
		System.out.println(ford.model+" owner is "+ford.owner.name+", "+ford.owner.age+" years old.");
		
		
		
		Car opel = new Car();
		opel.colour = "White";
		opel.currentGear = 2;
		opel.currentSpeed = 350;
		opel.maxSpeed = 230;
		opel.model = "Astra";
		
		opel.currentGear++;
		opel.currentSpeed+=20;
		
		

	}

}

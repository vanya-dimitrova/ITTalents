package CarShop;

public class CarShopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarShop avto = new CarShop(5);
		
		Car ford = new Car();
		ford.colour = "Black";
		ford.maxSpeed = 220;
		ford.model = "Ford Fiesta";
		avto.addCar(ford);
		
		Car opel = new Car();
		opel.colour = "Green";
		opel.maxSpeed = 230;
		opel.model = "Opel Astra";
		avto.addCar(opel);
		
		Car bmw = new Car();
		bmw.colour = "Grey";
		bmw.maxSpeed = 240;
		bmw.model = "BMW 7";
		avto.addCar(bmw);
		
		System.out.println("Cars available in shop to buy:");
		avto.showAllCarsInShop();
		System.out.println();
		
		System.out.println("Cars available in shop to buy:");
		Person gogo = new Person();
		avto.getNextCar();
		avto.sellNextCar(gogo);
		avto.removeCar(avto.getNextCar());
		avto.showAllCarsInShop();
		
		
		
		

	}

}

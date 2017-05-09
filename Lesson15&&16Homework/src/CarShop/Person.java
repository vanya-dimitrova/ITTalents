package CarShop;

public class Person {
	
	String name;
	int age;
	String personalNumber;
	boolean isWoman;
	int weigth;
	Person friend;
	
	void eat(){
		System.out.println(name+" is eating.");
	}
	
	void walk(){
		System.out.println(name+" is walking.");
	}
	
	void growUp(){
		age++;
	}
	
	void drinkWater(double liters){
		System.out.println(name+" is drinking water.");
		weigth+=liters;
	}

}

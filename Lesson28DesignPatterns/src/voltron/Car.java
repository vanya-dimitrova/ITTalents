package voltron;

public class Car {

	private int hp;
	private String model;
	private String color;
	private String brand;
	private int weight;
	
	public Car hp(int hp){
		this.hp = hp;
		return this;
	}
	
	public Car color(String color){
		this.color = color;
		return this;
	}
	
	public Car model(String model){
		this.model = model;
		return this;
	}
	
}

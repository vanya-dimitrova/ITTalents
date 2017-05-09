package nature;

import observers.Fish;
import observers.Giraffe;
import observers.Person;
import voltron.Car;

public class Demo {
	
	public static void main(String[] args) {
		
		Nature priroda = Nature.getInstance();
		priroda.subscribe(new Person());
		priroda.subscribe(new Fish());
		priroda.subscribe(new Giraffe());
	
		
		priroda.potop();
		System.out.println("--------------");
		priroda.pojar();
		System.out.println("--------------");
		priroda.zemetrus();
		
		Car car = new Car().model("Volvo").hp(100);
	}
}

import java.util.Scanner;

public class KrasiDoctor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello, welcome to my domain!");
		System.out.println("What is your body temperature?");
		double temp = sc.nextDouble();

		if (temp > 37) {
			System.out.println("Here, take this blue pill (hahaha)!");
			System.out.println("Go home and rest! (rip)");
		} 
		else 
		if(temp > 25){
			System.out.println("You are alive, but not for long");
		}
		else{
			System.out.println("You are dead already..");
		}
		

		System.out.println("GoodBye");
		sc.close();
	}
}

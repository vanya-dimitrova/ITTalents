import java.util.Scanner;

public class Task7DecisionOnData {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("The computer makes a decision for you:");
		System.out.println(" ");
		System.out.println("Type your money left: ");
		double money = sc.nextDouble();
		System.out.println("i am sick (true/false): ");
		boolean health = sc.nextBoolean();
		if (health ==true && money>10) {
			System.out.println("You can get some medicines.");
		} else if (health == true && money<10) {
			System.out.println("Stay home and take some tea.");
		} else if (health == false && money>10){
			System.out.println("Go out with friends for a movie.");
		} else if (health == false && money<10){
			System.out.println("Go out with friends for a coffee.");
		}
			
		sc.close();
		

	}

}

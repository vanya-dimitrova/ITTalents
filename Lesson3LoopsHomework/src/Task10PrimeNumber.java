import java.util.Scanner;

public class Task10PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number:");
		int x = sc.nextInt();
	
		boolean xIsPrime = true;
		for(int i = 2; i <= 9; i++){
			if(i != x && x%i == 0){
				xIsPrime = false;
				break;
			}
		}
			System.out.println(xIsPrime?"Number "+x+" is prime.":"Number "+x+" is not prime.");
			sc.close();		

	}

}

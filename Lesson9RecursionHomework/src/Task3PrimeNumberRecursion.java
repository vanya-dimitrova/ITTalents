import java.util.Scanner;

public class Task3PrimeNumberRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		while(number < 1){
			System.out.println("Enter number:");
			number = sc.nextInt();
		}
		int divider = 0;
		if(number <= 9){
			divider = number - 1;
		}
		else{ 
			divider = 8;
		}
		checkPrime(number, divider);	
		
		sc.close();
		
	}
	static void checkPrime(int a, int b){
		if(b == 1){
			System.out.println("Number is prime.");
			return;
		}
		else if(a%b == 0){
			System.out.println("Number is not prime");
			return;
		}
		checkPrime(a, b -1);
			
			
	}

}

import java.util.Scanner;

public class Book8_238_8 {

	public static void main(String[] args) {
		// is prime recursion method
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int divider = 2;
		isPrime(number, divider);
		sc.close();
		

	}
	static void isPrime(int a, int divider){
		if(divider == a - 1){
			System.out.println("Number is prime!");
		}
		else if(a%divider == 0){
			System.out.println("Number is not prime!");
			return;
		}
		else{
			isPrime(a, divider +1);
		}
		
		
	}
	

}

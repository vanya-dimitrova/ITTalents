import java.util.Scanner;

public class Book8_237_6 {

	public static void main(String[] args) {
		// reversed digits recursion method
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number > 10:");
		int n = sc.nextInt();
		while(n <=10){
			System.out.println("Enter number > 10:");
			n = sc.nextInt();
		}
		int reversed = 0;
		System.out.println(reverseNumber(n, reversed)); 
		sc.close();
		
	}
	static int reverseNumber(int a, int reversed){
		int multiplier = 1;
		for (int i = a; i > 10 ; i/=10){
			multiplier*=10;
			}
		reversed += (a%10)*multiplier;
		if(a > 10){
			return reverseNumber(a/10, reversed);
		}
		else{
			return reversed;
		}
		
	}

}

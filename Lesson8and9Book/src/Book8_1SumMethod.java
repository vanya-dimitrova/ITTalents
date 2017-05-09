import java.util.Scanner;

public class Book8_1SumMethod {

	public static void main(String[] args) {
		// sum method
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Sum of "+a+" and "+b+" is "+sum(a, b));
		
		sc.close();

	}
	static int sum(int a, int b){
		int result = a + b;
		return result;
	}

}

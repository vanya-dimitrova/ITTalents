import java.util.Scanner;

public class Book8_237_7 {

	public static void main(String[] args) {
		// print between two numbers, 2 options
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		System.out.println("Enter number:");
		int b = sc.nextInt();
		int c = a;
		
		printGradually(a, b, c);
		System.out.println();
		print(a, b);
		sc.close();

	}
	static void printGradually(int a, int b, int c){
		for (int i = a; i <= c; i++) {
			System.out.print(i);
		}
		if(c < b){
			System.out.println();
			c++;
			printGradually(a, b, c);
		}
	}
	static void print(int a, int b){
		if (b < a){
			return;
		}
		print(a, b - 1);
		for (int i = a; i <= b; i++) {
			System.out.print(i);
		}
		System.out.println(); 
	
	}

}

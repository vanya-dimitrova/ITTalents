import java.util.Scanner;

public class Task1FibonacciRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		
		System.out.println(fibonacci(x));
		sc.close();
	}
	static int fibonacci(int a){
		if(a == 1 || a == 2){
			return 1;
		}
		else{
			return fibonacci(a - 1) + fibonacci(a - 2);
		}
		
	}
}

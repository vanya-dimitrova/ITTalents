
public class Book8_5Fibonacci {

	public static void main(String[] args) {
		// Fibonacci
		int a = 8;
		System.out.println(fibonacci(a));

	}
	static int fibonacci(int a){
		if(a == 1 || a== 2){
			return 1;
		}
		return fibonacci(a - 1) + fibonacci(a - 2);
		
		
	}

}

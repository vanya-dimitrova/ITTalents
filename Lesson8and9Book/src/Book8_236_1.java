
public class Book8_236_1 {

	public static void main(String[] args) {
		// Factorial recursion method
		
		int a = 7;
		System.out.println(factorial(a));

	}
	static long factorial(int a){
		if(a == 1){
			return 1;
		}
		return a*factorial(a - 1);
	}

}

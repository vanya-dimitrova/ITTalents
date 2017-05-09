
public class FibonacciN {

	public static void main(String[] args) {
		// fibonacci N
		
		int a = 0;
		int b = 1;
		int k = 4;
		int result = 0;
		System.out.println(fibonacci2(a, b, k));
		for (int i = 0; i < k - 1; i++) {
			result = a + b;
			a = b;
			b = result;
		}
		System.out.println(result);
		System.out.println(fibonacci(k));
		System.out.println(fibonacciN(k, 2));
			
			
		

	}
	static int fibonacci2(int a, int b, int k){
		if(k == 1){
			return a + b;
		}
		if(k == 0){
			return 0;
		}
		return fibonacci2(a, b, k -1) + fibonacci2(a, b , k - 2);

	}
	static int fibonacciN(int a, int n){// not mine
		int i, total = 0;
		if (a<=1) return 1;
		else {
			for(i=1; i <= n; i++){
				total += fibonacciN(a-i, n);
			}
			return(total);
		}
	}
	
	static int fibonacci(int a){
		if(a == 1){
			return 1;
		}
		if(a == 0){
			return 0;
		}
		return fibonacci(a - 1) + fibonacci(a - 2);
	}

}

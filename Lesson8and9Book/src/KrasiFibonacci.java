
public class KrasiFibonacci {
	
	static int cnt = 0;

	public static void main(String[] args) {
		
		System.out.println("Result = " + fib(5000));
		
	}
	
	static int fib(int n){
		System.out.println(++cnt);
		if(n == 1){
			return 0;
		}
		if(n == 2){
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
}

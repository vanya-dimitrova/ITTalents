
public class KrasiFactorialRecursive {

	public static void main(String[] args) {
		
		int x = 15;
		int result = fact(x);
		System.out.println(result);
		
	}
	
	static int fact(int n){
		if(n == 1){
			return 1;
		}
		return n*fact(n-1);
	}
}

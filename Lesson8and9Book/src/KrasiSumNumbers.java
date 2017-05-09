
public class KrasiSumNumbers {

	public static void main(String[] args) {
		
		//5 + 4 + 3 + 2 + 1 => sum(5) = 5 + sum(4);
		int x = 15;
		int result = sum(x);
		System.out.println(result);
		
	}
	
	static int sum(int n){
		if(n == 1){
			return 1;
		}
		return n + sum(n-1);
	}
}


public class SumDigitsRecursively {

	public static void main(String[] args) {
		// Sum Digits Recursively
		
		int a = 456;
		System.out.println(sumDigits(a));

	}
	static int sumDigits(int a){
		if (a < 10){
			return a;
		}
		int digit = a%10;
		int sum = 0;
		
		return sum += sumDigits(a/10)+ digit;
	}
	

}

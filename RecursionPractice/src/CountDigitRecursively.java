
public class CountDigitRecursively {

	public static void main(String[] args) {
		// count digit recursively, 2 ot internet

		int a = 17227;
		int b = 2;
		System.out.println(countDigit(a, b));
		System.out.println(count(a, b));

	}

	static int countDigit(int a, int b) {
		int count = 0;
		if (a < 10 && a == b) {
			return count + 1;
		}
		if(a < 10 && a != b){
			return count;
		}
		count += countDigit(a / 10, b);
		int digit = a % 10;
		if (digit == b) {
			return count + 1;
		} else {
			return count;
		}

	} // ot internet
	static int count(int n, int digit){
		if (n == 0){
			return 0;
		}
		if (n % 10 == digit){
			return 1 + count(n / 10, digit);
		}
		else return count(n / 10, digit);
	}

}

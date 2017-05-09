
public class PowerRecursivelyLessRecursions {

	public static void main(String[] args) {
		// Power Recursively with Less Recursions on the bases that a^n ==
		// (a^2)^n/2 && a^n == (a^2)^n/2

		int a = 3;
		int b = 4;

		System.out.println(evenPower(a, b));
		System.out.println(oddPower(a, b));

	}

	static int evenPower(int a, int b) {
		if (b == 0) {
			return 1;
		}
		if (b == 1) {
			return a;
		} else {
			return a * a* evenPower(a, b / 2);
		}
	}

	static int oddPower(int a, int b) {
		if (b == 0) {
			return 1;
		}
		if (b == 1) {
			return a;
		} else {
			return a * a * oddPower(a, (b - 1) / 2);
		}
	}

}

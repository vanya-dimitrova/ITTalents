
public class CountCharInaString {

	public static void main(String[] args) {
		// Count Char In a String

		String a = "edXxnxxsxxo";
		int index = 0;
		System.out.println("Number of char 'x': " + countChar(a, index));

	}

	static int countChar(String a, int index) {
		if (index == a.length()) {
			return 0;
		}
		int counter = countChar(a, index + 1);
		if (a.charAt(index) == 'x') {
			return counter+ 1;
		} else {
			return counter;
		}

	}

}

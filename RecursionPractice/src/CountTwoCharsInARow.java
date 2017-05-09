
public class CountTwoCharsInARow {

	public static void main(String[] args) {
		// CountTwoCharsInARow

		String a = "rehi hiphen";
		int index = 0;
		System.out.println(countChars(a, index));

	}

	static int countChars(String a, int index) {
		if (index == a.length()) {
			return 0;
		}
		int count = countChars(a, index + 1);
		if (a.charAt(index) == 'i') {
			if (index != 0 && a.charAt(index - 1) == 'h') {
				return ++count;
			} else {
				return count;
			}
		}
		return count;
	}

}

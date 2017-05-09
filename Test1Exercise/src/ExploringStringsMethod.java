
public class ExploringStringsMethod {

	public static void main(String[] args) {
		// exploring strings method
		// 3 strings given, find the repeated words in all of them
		// print how many and the longest

		String a = "I go for a walk";
		String b = "I go with you for a walk";
		String c = "I go for a drink";

		inStringsRepeated(a, b, c);

	}

	static void inStringsRepeated(String a, String b, String c) {
		String[] aArray = a.split(" ");
		String[] repeated = new String[aArray.length];
		int countRepeated = 0;
		for (int i = 0; i < aArray.length; i++) {
			if (b.contains(aArray[i]) && c.contains(aArray[i])) {
				repeated[countRepeated] = aArray[i];
				countRepeated++;
			}
		}
		if (countRepeated == 0) {
			System.out.println("There are no repeated words.");
		} else {
			System.out.print("Repeated words are: ");
		}
		for (int i = 0; i < repeated.length; i++) {
			if (repeated[i] == null) {
				repeated[i] = " ";
			}
			System.out.print(repeated[i]);
			if (repeated[i] != " ") {
				System.out.print("; ");
			}
		}
		System.out.println();
		System.out.println("Repeated words are " + countRepeated);
		String max = aArray[0];
		for (int i = 1; i < repeated.length; i++) {
			if (max.length() < repeated[i].length()) {
				max = repeated[i];
			}
		}
		System.out.println("Longest word is '" + max + "'");

	}

}

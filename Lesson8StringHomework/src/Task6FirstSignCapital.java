import java.util.Scanner;

public class Task6FirstSignCapital {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter text in small case:");
		String text = sc.nextLine();
		String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < capitalLetter.length(); i++) {
			int capitalCase = text.indexOf(capitalLetter.charAt(i));
			while (capitalCase >= 0) {
				System.out.println("Enter text in small case:");
				text = sc.nextLine();
				for (i = 0; i < capitalLetter.length(); i++) {
					capitalCase = text.indexOf(capitalLetter.charAt(i));
				}
			}
		}
		StringBuilder corrected = new StringBuilder(text);
		String upperCase = new String(text.toUpperCase());

		for (int i = 0; i < corrected.length(); i++) {
			if (i == 0) {
				corrected.deleteCharAt(i);
				corrected.insert(i, upperCase.charAt(i));
			}
			else if (i > 0 && corrected.charAt(i) == ' ') {
				corrected.deleteCharAt(i + 1);
				corrected.insert((i + 1), upperCase.charAt(i + 1));
			}	
		}
		System.out.println(corrected);
		sc.close();

	}

}

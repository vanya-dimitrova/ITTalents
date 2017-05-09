import java.util.Scanner;

public class Book9_238_2 {

	public static void main(String[] args) {
		// each word with capital letters
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one sentence:");
		String a = sc.nextLine();
		while (a.indexOf(' ') == -1) {
			System.out.println("Enter one sentence:");
			a = sc.nextLine();
		}
		String upper = a.toUpperCase();
		StringBuilder corrected = new StringBuilder(a);
		String sub = upper.substring(0, 1);
		corrected.replace(0, 1, sub);
		for (int i = 0; i < a.length(); i++) {
			if (i > 0 && corrected.charAt(i - 1) == ' ') {
				sub = upper.substring(i, i + 1);
				corrected.replace(i, i + 1, sub);
			}
		}
		System.out.println(corrected);
		sc.close();
	}

}

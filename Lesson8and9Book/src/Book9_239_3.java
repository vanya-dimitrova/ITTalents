import java.util.Scanner;

public class Book9_239_3 {

	public static void main(String[] args) {
		// count words, longest word

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sequence of words separated with space:");
		String a = sc.nextLine();
		while (a.indexOf(' ') == -1) {
			System.out.println("Enter sequence of words separated with space:");
			a = sc.nextLine();
		}

		String[] newA = a.split(" ");
		System.out.println("Text conains " + newA.length + " words.");

		int counter = 0;
		int max = 0;
		for (int i = 0; i < newA.length; i++) {
			for (int j = 0; j < newA[i].length(); j++) {
				counter++;
			}
			if (counter > max) {
				max = counter;
			}
			counter = 0;
		}
		System.out.println("The longest word contains " + max + " letters.");
		sc.close();
	}

}

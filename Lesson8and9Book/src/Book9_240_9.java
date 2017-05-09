import java.util.Scanner;

public class Book9_240_9 {

	public static void main(String[] args) {
		// check times of every letter

		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String b = "abcdefghijklmnopqrstuvwxyz";

		int counter = 0;
		int max = 0;
		int index = 0;
		for (int i = 0; i < b.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if (b.charAt(i) == a.charAt(j)) {
					counter++;
				}
			}
			if (counter >= max) {
				max = counter;
				index = i;
			}
			System.out.println("'" + b.charAt(i) + "' is used " + counter + " times.");
			counter = 0;
		}
		System.out.println("'"+b.charAt(index) + "' is used maximum times.");
		sc.close();
	}

}

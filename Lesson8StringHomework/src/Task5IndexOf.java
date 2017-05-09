import java.util.Scanner;

public class Task5IndexOf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word:");
		String word1 = sc.next();
		System.out.println("Enter one more word:");
		String word2 = sc.next();

		for (int i = 0; i < word2.length(); i++) {
			int duplicate = word2.indexOf(word1.charAt(0));
			if (duplicate > 0) {
				for (int j = 0; j < duplicate; j++) {
					System.out.println(word2.charAt(j));
				}
				System.out.println(word1);
				for (int j = duplicate + 1; j < word2.length(); j++) {
					System.out.println(word2.charAt(j));
				}
				break;
			} else if (i == word2.length() - 1 && duplicate < 0) {
				System.out.println("There are no matching letters.");
			}
		}
		sc.close();
	}

}

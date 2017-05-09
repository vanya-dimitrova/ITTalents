import java.util.Scanner;

public class Task8IsPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter text:");
		String text = sc.nextLine();

		for (int i = 0; i <= text.length() / 2; i++) {
			if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
				System.out.println("The word is not palindrome!");
				break;
			}
			if (i == text.length() / 2) {
				System.out.println("The word is palindrome!");
			}
		}
		sc.close();
	}

}

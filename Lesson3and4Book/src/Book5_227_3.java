import java.util.Scanner;

public class Book5_227_3 {

	public static void main(String[] args) {
		// palindrome?

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number < 99999 and > 1000:");
		int number = sc.nextInt();
		while (number < 1000 || number > 9999999) {
			System.out.println("Enter number < 99999 and > 1000:");
			number = sc.nextInt();
		}
		int mnojitel = 1;
		int newNumber = 0;
		int counter = 0;
		for (int i = number / 10; i > 0; i /= 10) {
			mnojitel *= 10;
			;
		}
		for (int i = number; i > 0; i /= 10) {
			int digit = i % 10;
			newNumber += digit * mnojitel;
			mnojitel /= 10;
		}
		System.out.println(newNumber);

		boolean palindrome = true;
		if (number != newNumber) {
			palindrome = false;
		}
		System.out.println(palindrome ? "The number " + number + " is palindrome."
				: "The number " + number + " is not palindrome.");
sc.close();
	}

}

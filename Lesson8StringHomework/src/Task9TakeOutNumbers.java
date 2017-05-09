
import java.util.Scanner;

public class Task9TakeOutNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
		String t = sc.next();
		System.out.println(t);

		int digit = 0;
		int counter = 0;
		int number = 0;
		int sumNumbers = 0;

		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) >= '0' && t.charAt(i) <= '9' && (i == t.length() - 1
					|| i < t.length() - 1 && (t.charAt(i + 1) < '0' || t.charAt(i + 1) > '9'))) {
				int multifier = 1;
				for (int j = 0; j <= counter; j++) {
					digit = (t.charAt(i - j) - '0') * multifier;
					number += digit;
					multifier *= 10;
					if (i > 0 && t.charAt((i - j) - 1) == '-') {
						number *= -1;
					}
				}
				System.out.println(number);
				multifier = 1;
				counter = 0;
			} else if (t.charAt(i) >= '0' && t.charAt(i) <= '9' && i < t.length() - 1 && t.charAt(i + 1) >= '0'
					&& t.charAt(i + 1) <= '9') {
				counter++;
			}
			sumNumbers += number;
			number = 0;
		}
		System.out.println("The sum is: "+sumNumbers);
		sc.close();
	}
}
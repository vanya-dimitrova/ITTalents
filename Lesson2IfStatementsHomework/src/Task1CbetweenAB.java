import java.util.Scanner;

public class Task1CbetweenAB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number A:");
		long a = sc.nextLong();
		System.out.println(" ");
		System.out.print("Enter number B:");
		long b = sc.nextLong();
		System.out.println(" ");
		System.out.print("Enter number C:");
		long c = sc.nextLong();

		if (c > a && c < b) {
			System.out.println(c + " is between " + a + " and " + b);
		} else {
			System.out.println(c + " is not between " + a + " and " + b);
		}
		sc.close();
	}

}

import java.util.Scanner;

public class Book5_228_7 {

	public static void main(String[] args) {
		// first ten > number divided by 2, 3, 5

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		
		int counter = 1;
		for (int i = a + 1; i < a + 100; i++) {
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
				System.out.print(counter + ":" + i+"; ");
				counter++;
			}
			if (counter == 11) {
				break;
			}

		}
		sc.close();

	}

}

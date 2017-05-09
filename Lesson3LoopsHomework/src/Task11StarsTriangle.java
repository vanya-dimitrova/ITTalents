import java.util.Scanner;

public class Task11StarsTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter height:");
		int height = sc.nextInt();
		int zvezdichka = 1;
		int space = height;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < space - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < zvezdichka; k++) {
				System.out.print("*");
			}
			space--;
			zvezdichka += 2;
			System.out.println();
		}
		sc.close();
	}

}

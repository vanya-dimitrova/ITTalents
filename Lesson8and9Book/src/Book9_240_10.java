import java.util.Scanner;

public class Book9_240_10 {

	public static void main(String[] args) {
		// string array in a frame

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] b = a.split(" ");
		int max = 0;
		for (int i = 0; i < b.length; i++) {
			int j = 0;
			for (j = 0; j < b[i].length(); j++) {
			}
			if (j > max)
				max = j;
		}
		for (int i = 0; i < b.length + 2; i++) {
			for (int k = 0; k < max + 2; k++) {
				if (i == 0 || i == b.length + 1 || k == 0 || k == max + 1) {
					System.out.print("*");
				}
				else
				if (k > b[i - 1].length()) {
					System.out.print(" ");
				}
				else{
					System.out.print(b[i - 1].charAt(k - 1));
				}

			}
			System.out.println();

		}
		sc.close();

	}

}

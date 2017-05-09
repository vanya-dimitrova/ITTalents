import java.util.Scanner;

public class Book7_234_9 {

	public static void main(String[] args) {
		// fill in matrix diagonally

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N:");
		int n = sc.nextInt();
		System.out.println("Enter M:");
		int m = sc.nextInt();

		int a = 1;
		int row = 0;
		int col = 0;
		int[][] arr = new int[n][m];
        
		// nad obratnia diagonal
		for (int i = 0; i < n; i++) {
			for (int j = row; j >= 0; j--) {
				arr[j][col] = a;
				a++;
				col++;
			}
			row++;
			col = 0;
		}
		// ako e kvadratna matrica
		int rowLimit = 0;
		if (m % 2 == 0) {
			rowLimit = 1;
		} else {
			rowLimit = 0;
		}
		// pod obratnia diagonal
		row -= 1;
		col += 1;
		for (int i = 0; i < n; i++) {
			for (int j = row; j >= rowLimit; j--) {
				arr[j][col] = a;
				a++;
				col++;
			}
			row = n - 1;
			col = i + 2;
			rowLimit++;

		}
        // print
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}

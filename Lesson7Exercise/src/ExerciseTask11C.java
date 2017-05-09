import java.util.Scanner;

public class ExerciseTask11C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lenght = 0;
		int lenght1 = 0;
		do {
			System.out.println("Enter positive number for n:");
			lenght = sc.nextInt();
			System.out.println("Enter positive number for m:");
			lenght1 = sc.nextInt();
		} while (lenght < 0 || lenght1 < 0);

		int[][] arr = new int[lenght][lenght1];
		int value = 1;
		int col = 0;
		int rowNumber = 0;

		for (int i = 0; i < lenght; i++) {
			for (int row = rowNumber; row >= 0; row--) {
				arr[row][col] = value;
				value++;
				col++;
			}
			col = 0;
			rowNumber++;
		}
		int row = lenght - 1;
		int colNumber = 1;
		for (int i = 0; i < lenght; i++) {
			for (col = colNumber; col < lenght1; col++) {
				arr[row][col] = value;
				value++;
				row--;
			}
			row = lenght - 1;
			colNumber++;
		}
		// print
		for (row = 0; row < lenght; row++) {
			for (col = 0; col < lenght1; col++) {
				System.out.print(arr[row][col] + ",");
			}
			System.out.println();
		}
		sc.close();

	}

}

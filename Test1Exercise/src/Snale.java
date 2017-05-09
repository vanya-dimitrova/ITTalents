
public class Snale {


	public static void main(String[] args) {
	
		// snale

	    int a = 6;
		int b = 6;
		int row = 0;
		int col = 0;
		int[][] arr = new int[a][b];

		for (int i = 1; i <= a * b; i++) {
			if (row == a - 1 && col != b - 1 || // GO RIGHT
					(row != a - 1 && col != b - 1 && arr[row + 1][col] > 0 && arr[row][col + 1] == 0)) {
				arr[row][col] = i;
				col++;
			} else if (col == b - 1 && row != 0 || // GO UP
					(col != b - 1 && row != 0 && arr[row][col + 1] > 0 && arr[row - 1][col] == 0)) {
				arr[row][col] = i;
				row--;
			} else if (row == 0 && col != 0 && arr[row][col - 1] == 0 || // GO
																			// LEFT
					(row != 0 && col != 0 && arr[row - 1][col] != 0 && arr[row][col - 1] == 0)) {
				arr[row][col] = i;
				col--;
			} else if (row == 0 && col == 0 || (row != 0 && col == 0 && arr[row - 1][col] != 0) || // GO
																									// DOWN
					(col != 0 && arr[row][col - 1] != 0)) {
				arr[row][col] = i;
				row++;
			}
		}
		for (int j = 0; j < a; j++) {
			for (int j2 = 0; j2 < b; j2++) {
				System.out.print(arr[j][j2] + ";  ");
			}
			System.out.println();
		}

	}

}

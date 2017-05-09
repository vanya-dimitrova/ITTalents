
public class Book7_234_7 {

	public static void main(String[] args) {
		// max sub-matrix

		int[][] arr = { { 5, 4, 7, 4, 7, 2},
				        { 3, 6, 8, 1, 5, 1 }, 
				        { 2, 3, 5, 9, 4, 7 },
				        { 9, 2, 5, 0, 1, 6 },
				        { 4, 6, 4, 7, 3, 8 }
				        };

		int sum = 0;
		int maxSum = 0;
		int row = 0;
		int col = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[0].length - 1; j++) {
				sum = arr[i][j] + arr[i + 1][j] + arr[i][j + 1] + arr[i + 1][j + 1];
				if (sum > maxSum) {
					maxSum = sum;
					row = i;
					col = j;
				}
			}
		}
		for (int i = row; i < row + 2; i++) {
			for (int j = col; j < col + 2; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}


public class Book7_233_3 {

	public static void main(String[] args) {
		// max sum of diagonals

		int[][] arr = { { 6, 4, 9, 8, 3 }, 
				        { 2, 5, 6, 3, 1 },
				        { 3, 4, 8, 8, 3 }, 
				        { 2, 6, 6, 5, 1 },
				        { 1, 4, 7, 8, 1 }
				      };
		int sumMainDiagonal = 0;
		int sumSubDiagonal = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					sumMainDiagonal += arr[i][j];
				}
				if ((i + j) == arr.length - 1) {
					sumSubDiagonal += arr[i][j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (sumMainDiagonal > sumSubDiagonal) {
					if (i == j) {
						System.out.print(arr[i][j]);
					}
				} else {
					if ((i + j) == arr.length - 1) {
						System.out.print(arr[i][j]);
					}
				}
			}
		}

	}

}

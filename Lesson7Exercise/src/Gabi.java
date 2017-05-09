
public class Gabi {
	public static void main(String[] args) {

		int n = 9;
		int m = 5;

		int[][] arr = new int[n][m];

		int counter = 1;
		int indexSum = 0;

		for (int row = 0; row <= arr.length; row++) {
			int currRow = row;
			for (int col = 0; col < arr[0].length; col++) {
				if (row < arr.length && currRow + col == indexSum && currRow >= 0) {
					arr[currRow][col] = counter;
					counter++;
					currRow--;
				} else {
					if (row == arr.length) {
						int rowBounds = m == n ? 1 : 0;
						for (int i = 1; i < arr[0].length; i++) {
							currRow = n - 1;
							int currCol = i;
							while (currRow >= rowBounds && currCol < m && currRow + currCol == indexSum) {
								arr[currRow][currCol] = counter;
								counter++;
								currCol++;
								currRow--;

							}
							indexSum++;
						}
					}
				}
			}
			indexSum++;

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}

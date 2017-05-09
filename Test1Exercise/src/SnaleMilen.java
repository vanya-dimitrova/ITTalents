import java.util.Scanner;

public class SnaleMilen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two positive numbers");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		int count = 1;
		int iterr = 0;
		int check = n * m;
		int row = 0;
		int col = 0;
		int i = 0;
		int j = 0;
		while (count <= check) {
			switch (iterr % 4) {
			case 0:
				for (row = i, col = j; row < n; row++) {
					arr[row][col] = count;
					count++;
				}
				n--;
				row--;
				col++;
				iterr++;
				break;
			case 1:
				for (; col < m; col++) {
					arr[row][col] = count;
					count++;
				}
				m--;
				col--;
				row--;
				iterr++;
				break;
			case 2:
				for (; row >= i; row--) {
					arr[row][col] = count;
					count++;
				}
				i++;
				col--;
				row++;
				iterr++;
				break;
			case 3:
				for (; col > j; col--) {
					arr[row][col] = count;
					count++;
				}
				j++;
				iterr++;
				break;
			}
		}
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 10) {
					System.out.print("  " + arr[i][j] + " ");
				} else {
					if (arr[i][j] < 100 && arr[i][j] >= 10) {
						System.out.print(" " + arr[i][j] + " ");
					} else {
						System.out.print(arr[i][j] + " ");
					}
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
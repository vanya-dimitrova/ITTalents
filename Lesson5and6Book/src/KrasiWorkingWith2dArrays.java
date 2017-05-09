import java.util.Arrays;
import java.util.Scanner;

public class KrasiWorkingWith2dArrays {

	public static void main(String[] args) {
		
		//read 2 variables - rows and columns
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows");
		int rows = sc.nextInt();
		System.out.println("Please enter number of column");
		int cols = sc.nextInt();
		//create matrix [rows][cols]
		int[][] matrix = new int[rows][cols];
		//for each row and each column - ask for value
		
		for(int row = 0; row < matrix.length; row++){//for each row
			for(int col = 0; col < matrix[row].length; col++){//for each column on this row
				System.out.println("Enter value for cell [" + row + "][" + col + "]");
				matrix[row][col] = sc.nextInt();//the cell on this row and this column = input
			}
		}
		System.out.println("Done");
		//print matrix in table format

		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[row].length; col++){
				if(col == matrix[row].length-1){//in the last column
					System.out.print(matrix[row][col]);
				}
				else{
					System.out.print(matrix[row][col] + ", ");
				}
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(matrix));
		sc.close();
	}
}

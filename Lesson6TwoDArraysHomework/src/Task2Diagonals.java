
import java.util.Scanner;

public class Task2Diagonals {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array2d square matrix size:");
		int lenght = sc.nextInt();
		int[][] arr2d = new int[lenght][lenght];

		for(int row = 0; row < arr2d.length; row++){
			for(int col = 0; col < arr2d.length; col++){
				System.out.print("Enter array value:");
				arr2d[row][col] = sc.nextInt();
				}
			}
		for(int row = 0; row < arr2d.length; row++){
			for(int col = 0; col < arr2d.length; col++){
				if(row == col){
					System.out.print(arr2d[row][col]+" ");
				}
			}
		}
			System.out.println();
			for(int row = 0; row < arr2d.length; row++){
				for(int col = 0; col < arr2d.length; col++){
					if((row + col) == lenght -1){
						System.out.print(arr2d[row][col]+" ");
					}
				}
			}
			sc.close();
			
		

	}

}


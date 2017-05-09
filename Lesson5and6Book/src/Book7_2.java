
public class Book7_2 {

	public static void main(String[] args) {
		// print diagonals of a square matrix
		
		int[][] arr = {{2, 5, 7, 3, 2},
				       {3, 5, 3, 1, 4},
				       {6, 5, 2, 8, 4},
				       {2, 7, 8, 6, 4},
				       {1, 4, 9, 3, 7} };
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j){
					System.out.print(arr[i][j]);
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if((i + j) == arr.length - 1){
					System.out.print(arr[i][j]);
				}
			}
		} 
		

	}

}


public class Task4Print90Degrees {

	public static void main(String[] args) {
		
		int[][] arr = {{11, 22, 33}, {12, 23, 34}, {13, 24, 35}};
		int row = 0;
		int col = 0;
		for(col = 0; col < arr.length; col++){
			for(row = arr.length - 1; row >= 0; row--){
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}

	}

}


public class Book7_234_6 {

	public static void main(String[] args) {
		// magic matrix - compare while summing
		// option 2 - make a new matrix with sums value and compare values
		
		int[][] arr = {
	        	   {4, 4, 4, 4, 4},
	        	   {4, 4, 4, 4, 4},
	        	   {4, 4, 3, 4, 4},
	        	   {4, 4, 4, 4, 4},
	        	   {4, 4, 4, 4, 4}
	              };
		int sumRow = 0;
		int sumRowCompare = 0;
		int sumCol = 0;
		int sumColCompare = 0;;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sumRow+=arr[i][j];
				sumCol+=arr[j][i];
			}
			if(i == 0){
				sumRowCompare = sumRow;
				sumColCompare = sumCol;
			}
			else if(sumRowCompare != sumRow || sumColCompare != sumCol || sumRow != sumCol ){
					System.out.println("Matrix is not magic!");
					break;
			}
			else if(i == arr.length -1){
				System.out.println("Matrix is magic!");
			}
			sumRow = 0;
			sumCol = 0;
		}

	}

}

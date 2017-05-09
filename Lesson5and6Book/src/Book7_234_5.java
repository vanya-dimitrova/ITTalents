
public class Book7_234_5 {

	public static void main(String[] args) {
		// multiply values under main diagonal
		
		int[][] arr = {
		        	   {4, 7, 4, 7, 2},
		        	   {3, 6, 5, 8, 1},
		        	   {2, 3, 5, 9, 4},
		        	   {9, 2, 5, 0, 1},
		        	   {4, 6, 4, 7, 3}
		              };
		
		int multiply = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++){
				if(j == i -1){
					multiply*=arr[i][j];
				}
			}
		}
		System.out.println(multiply);
		
				   
		
		

	}

}

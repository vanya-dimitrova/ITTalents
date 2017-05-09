
public class Book7_3 {

	public static void main(String[] args) {
		// turn array 90 degrees right
		
		int[][] arr = {{1, 2, 3, 4, 5},
				       {6, 7, 8, 9, 10},
				       {11, 12, 13, 14, 15},
				       {16, 17, 18, 19, 20}
				       };
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				System.out.print(arr[j][i]+",");
			}
			System.out.println();
		}
		
		
		

	}

}

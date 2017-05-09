
public class Book8_235_3 {

	public static void main(String[] args) {
		// read array method
		
		int[][] arr = {
                {2, 5, 6, 8, 1},
                {5, 7, 8, 2, 4},
                {6, 7, 1, 9, 3}
               };
		readArray(arr);

	}
	static void readArray(int[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

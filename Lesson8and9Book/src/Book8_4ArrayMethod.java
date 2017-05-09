
public class Book8_4ArrayMethod {

	public static void main(String[] args) {
		// Array Method
		
		int x = 4;
		int y = 5;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(makeArray(x, y)[i][j]);	
			}
			System.out.println();
			
			
		}
	}
		static int[][] makeArray(int a, int b){
			int[][] arr = new int[a][b];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = 0;
				}
			}
			return arr;
		}

}

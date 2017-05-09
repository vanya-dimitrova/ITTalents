
public class Book7_1 {

	public static void main(String[] args) {
		
		int[][] arr = {
				       {1, 66, 11, 2, 13, 4},
				       {11, 5, 2, 13, 42, 51},
				       {9, 5, 3, 14, 55, 6},
				       {8, 14, 42, 53, 6, 17},
				       {18, 4, 2, 15, 61, 7},
				       {9, 15, 31, 47, 5, 16},
				       };
		int count = 0;
		int countFinal = 0;
		int multNumber = 0;
		
		for(int rowFixed = 0; rowFixed < arr.length; rowFixed++){
			for(int colFixed = 0; colFixed < 6; colFixed++){
				for(int row = 0; row < arr.length; row++){
					for(int col = 0; col < 6; col++){
						if(arr[rowFixed][colFixed] == arr[row][col]){
							count++;
						}
					}
				}
				if(count > countFinal){
				countFinal = count;
				multNumber = arr[rowFixed][colFixed];
				}
				count =0;
			}

		}
		System.out.println(multNumber);

	}

}


public class Task7 {

	public static void main(String[] args) {
		
		int[][] arr = {
			        	{4, 7, 5},
				        {5, 8, 3},
				        {6, 8, 9}
		              };
		
		for(int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length; j++) {
				if(i > j){
					System.out.print(arr[i][j]);
				}
			}
		}
		
		

	}

}

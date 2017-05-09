
public class Task5CompareRowToColSum {

	public static void main(String[] args) {
		
		int[][] arr = {{11, 2, 13, 4}, {2, 13, 42, 51}, {3, 14, 55, 6}, {42, 5, 6, 17}};
		int row = 0;
		int col = 0;
		int sumRow = 0;
		int sumRowMax = 0;
		int sumCol = 0;
		int sumColMax = 0;
		
		for(row = 0; row < arr.length; row++){
			for(col = 0; col < arr.length; col++){
				sumRow+=arr[row][col];
			}
			if(sumRow > sumRowMax){
				sumRowMax = sumRow;
			}
		}
		for(col = 0; col < arr.length; col++){
			for(row = arr.length - 1; row >=0; row--){
				sumCol+=arr[row][col];
			}
			if(sumCol > sumColMax){
				sumColMax = sumCol;
			}
		}
		if(sumRowMax > sumColMax){
			System.out.println("Maksimalnata suma ot redovete e > ot maksimalnata suma po koloni.");
		}else{
			System.out.println("Maksimalnata suma ot redovete e < ot maksimalnata suma po koloni.");
		}
			
		

	}
	
	

}

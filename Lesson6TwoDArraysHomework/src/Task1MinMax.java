
public class Task1MinMax {

	public static void main(String[] args) {
		
		int[][] arr = {{16, 25, 13, 0, 5}, {2, 31, 4, 15, 6}, {3, 44, 5, 6, 7}, {58, 8, 92, 5, 3}, {5, 17, 8, 31, 2}, {66, 4, 27, 38, 7}}; 
        
		int min = arr[0][0];
		int max = arr[0][0];
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[row].length; col++){
				if(min > arr[row][col]){
					min = arr[row][col];
				}
				if(max < arr[row][col]){
					max = arr[row][col];
				}
			}
		}
		System.out.println("The smalest value is: "+min);
		System.out.println("The biggest value is: "+max);
	}

}


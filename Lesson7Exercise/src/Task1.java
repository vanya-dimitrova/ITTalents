
public class Task1 {

	public static void main(String[] args) {
		
		int[] arr = {10, -1, 03, 5, 9, 50, 4};
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] <=0){
				break;
			}
		}
		System.out.println("The array is not constructed of positive values only.");

	}

}

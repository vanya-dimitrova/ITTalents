
public class Book6_3 {

	public static void main(String[] args) {
		
		int[] arr = {4, 7, 9, 20, 31, 6, 10, 78, 15, 2,13,15, 77, 33, 56, 2, 0, 5, 78, 36};
		int index = 0;
		int index1 = 0;
		int diff = arr[index] - arr[index1];
		for(index = 0; index < arr.length; index++){
			for(index1 = 0; index1 < arr.length; index1++){
				diff = arr[index] - arr[index1];
				if(diff < 0){
					break;
				}else if(index1 == arr.length - 1){
					System.out.println(arr[index]);
					}
		   }
		}
		
		

	}

}

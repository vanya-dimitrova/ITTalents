
public class Task8LongestDuplicate {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 1, 4, 3, 5, 8, 4, 8, 9, 8, 3, 9};
		
		int ii = 0;
		int count = 1;
		int longest= 0;
		for(int i = 0; i < arr.length - 1; i++){
			System.out.print(arr[i]);
			if(arr[i] == arr[i+1]){
				count++;
	            if(count > longest){
				longest = count;
				ii = arr[i];
	            }
			}
			else{
			count = 1;
			}
		}
		System.out.println("The longest row of similiar numbers is "+ii+"; "+longest+" times.");
		

	}

}

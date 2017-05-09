import java.util.Arrays;

public class KrasiCountingSort {

	public static void main(String[] args) {
		
		int[] arr = {4,2,6,2,5,7,4,2,3};
		countingSort(arr);
		System.out.println("Sorted array now looks like this:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	static void countingSort(int[] masiv){
		//find max
		int max = masiv[0];
		for (int i = 0; i < masiv.length; i++) {
			if(masiv[i] > max ){
				max = masiv[i];
			}
		}
		//find min to optimize
		//create array of max+1 counters
		int[] helper = new int[max+1];
		//for each value of original array increment the corresponding counter
		for (int i = 0; i < masiv.length; i++) {
			int value = masiv[i];
			helper[value]++;
		}
		System.out.println("Helper looks like this: " + Arrays.toString(helper));
		//for each counter of helper array
		int idx = 0;
		for (int i = 0; i < helper.length; i++) {
			//counter times write the counted value
			int counter = helper[i];//i is the counted value
			for (int j = 0; j < counter; j++) {
				masiv[idx] = i;
				idx++;
			}
		}
	}
}

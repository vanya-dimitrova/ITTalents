
public class KrasiSelectionSort {

	public static void main(String[] args) {
		

		int[] arr = {5,3,6,4,8,7};
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void selectionSort(int[] masiv){
		//find min and max starting from first
		for (int k = 0; k < masiv.length/2; k++) {
			int min = masiv[k];
			int minIndex = k;
			int max = masiv[k];
			int maxIndex = k;
			for (int i = k; i < masiv.length; i++) {
				if(min > masiv[i]){
					min = masiv[i];
					minIndex = i;
				}
				if(max< masiv[i]){
					max = masiv[i];
					maxIndex = i;
				}
			}
			//swap min with first
			int temp = masiv[k];
			masiv[k] = masiv[minIndex];
			masiv[minIndex] = temp;
			//swap max with last
			int temp2 = masiv[maxIndex];
			masiv[maxIndex] = masiv[masiv.length-1-k];
			masiv[masiv.length-1-k] = temp2;
		}
	}
}

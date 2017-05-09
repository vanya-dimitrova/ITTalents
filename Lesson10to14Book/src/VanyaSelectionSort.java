
public class VanyaSelectionSort {

	public static void main(String[] args) {
		// Selection sort
		
		int[] arr = {2, 3, 5, 1, 8, 4, 7, 9, 0, 3};
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
	static void selectionSort(int[] arr){
		int end = arr.length - 1;
		int start = 0;
		for (int i = 0; i < arr.length/2; i++) {
			int indexMax = start;
			int indexMin = start;
			
			for (int j = start; j <= end; j++) {
				if(arr[j] > arr[indexMax]){
					indexMax = j;
				}
				if(arr[j] < arr[indexMin]){
					indexMin = j;
				}
			}
			int temp = arr[end];
			arr[end] = arr[indexMax];
			arr[indexMax] = temp;
			
			if(indexMin == end){
				indexMin = indexMax;
			}
		
			temp = arr[start];
			arr[start] = arr[indexMin];
			arr[indexMin] = temp;
			end--;
			start++;
		}
	}

}

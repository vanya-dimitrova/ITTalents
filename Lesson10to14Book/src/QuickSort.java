import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] array = {4,7,2,6,9,1,3,11,0,24,5};
		quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

	//get the index of the pivot when paritioning from start to end
	//call the same method for the first half of the array
	//call the same method for the second half of the array
	//the array has to be sorted, but consists of only one element - it is already done!
	static void quickSort(int[] arr, int start, int end){
		if(start >= end){
			return;
		}
		int pivotIndex = partition(arr, start, end);
		quickSort(arr, start, pivotIndex-1);
		quickSort(arr, pivotIndex+1, end);
	}
	
	static int partition(int[] arr, int start, int end){
		//create a variable to hold the index of the next lesser element = IDX
		int idx = start;
		//choose pivot - in our case - the last element
		int pivot = arr[end];
		//traverse all elements from first ot pivot
		for (int i = start; i < end; i++) {
			//compare elements with pivot
			//if element is lesser than pivot - place it in IDX cell and increment IDX
			if(arr[i] <= pivot){
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		//at last - place the pivot on the IDX cell
		int temp = arr[end];
		arr[end] = arr[idx];
		arr[idx] = temp;
		return idx;
	}
}

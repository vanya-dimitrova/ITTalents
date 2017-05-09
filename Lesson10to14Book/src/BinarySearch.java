
public class BinarySearch {

	public static void main(String[] args) {
		
		int[] array = {3,5,6,7,11,31,44,56,78,88,93,132,243};
		int x = 8;
		int index = binarySearch(array, x, 0, array.length-1);
		System.out.println(index);
	}

	//find mid index
	//compare x with arr[mid]
	//if equal - return mid index
	//if not:
		//if x > arr[mid] -> call the same method with new start = mid+1 and new end = old end
		//if x < arr[mid] -> call the same method with new start = old start and new end = mid-1
	static int binarySearch(int[] arr, int x, int start, int end){
//		if(start > end){
//			return -1;
//		}
		int mid = (start + end)/2;
		if(x == arr[mid]){
			return mid;
		}
		if(start == end){
			return -1;
		}
		if(x > arr[mid]){
			return binarySearch(arr, x, mid+1, end);
		}
		return binarySearch(arr, x, start, mid-1);
	}
}


public class Book8_237_2 {

	public static void main(String[] args) {
		// min value recursion method, 2 options
		
		int[] arr = {5, 7, 4, 2, 1, 9};
		int index = 0;
		int min = arr[index];
		System.out.println(minValue(arr, index, min));
		System.out.println(min(arr, index));

	}
	static int minValue(int[] arr, int index, int min){
		if(arr[index] < min){
			min = arr[index];
		}
		if(index < arr.length - 1){
			return minValue(arr, index + 1, min);
		}
		return min;
	}
	static int min(int[] a, int index){
		if(index == a.length - 1){
			return a[index];
		}
		int min = min(a, index + 1);
		if(a[index] < min){
			return a[index];
		}
		return min;
	}

}

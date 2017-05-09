
public class Book8_237_3 {

	public static void main(String[] args) {
		// monotonously ascending check recursion method,2 options
		
		int[] arr = {2, 4, 6, 7, 8};
		int index = 0;
		checkAscending(arr, index);
		System.out.println("This array is ascending monotonously: "+mono(arr, index));

	}
	static void checkAscending(int[] arr, int index){
		if(index < arr.length - 1 && arr[index] < arr[index +1]){
			checkAscending(arr, index + 1);
		}
		else if(index < arr.length - 1 && arr[index] > arr[index +1]){
			System.out.println("This array is not monotonously ascending!");
		}
		else{
			System.out.println("This array is monotonously ascending!");
		}
	
		
	
	}
	static boolean mono(int[] a, int index){
		if(index == a.length - 1){
			return true;
		}
		if(a[index] > a[index + 1]){
		    return false;
		}else{
			return mono(a, index + 1);
		}

	}


}

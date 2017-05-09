
public class ArrayReversedRecursively {

	public static void main(String[] args) {
		// array reversed recursively
		int[] arr = { 2, 5, 4, 7, 9, 3, 6, 8, 7, 3, 6 };
		reverseArray(arr, arr.length);
		printArr(arr);
			
		

	}

	static void reverseArray(int a[], int b) {
		int temp = a[a.length - b];
		a[a.length - b] = a[b - 1];
		a[b - 1] = temp;
		if (b > a.length / 2 + 1) {
			reverseArray(a, b - 1);
		}
		

	}
	static void printArr(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i < a.length - 1){
				System.out.print(", ");
			}
		}
	}

}

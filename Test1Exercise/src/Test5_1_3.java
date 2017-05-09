
public class Test5_1_3 {

	public static void main(String[] args) {
		// difference between min and max with recursion, 2 option for min is better code
		int[] a = { 3, 6, 4, 1, 9, 5, 3 };
		int start = 0;
		int end = a.length - 1;
		System.out.println(findMin(a, start, end));
		System.out.println("Difference between maximum and minimum element is "
				+ (findMax(a, start, end) - findMin(a, start, end)));

	}

	static int findMax(int a[], int start, int end) {
		if (start == end) {
			return start;
		}
		if (a[start] >= a[end]) {
			findMax(a, start, end - 1);
		}
		if (a[start] < a[end]) {
			a[start] = a[end];
			findMax(a, start, end - 1);
		}
		return a[start];
	}

	static int findMin(int a[], int start, int end) {
		if (start == end) {
			return start;
		}
		if (a[start] <= a[end]) {
			findMin(a, start, end - 1);
		}
		if (a[start] > a[end]) {
			a[start] = a[end];
			findMin(a, start, end - 1);
		}
		return a[start];
	}

	static int min(int[]a, int index){
		if(index == a.length -1){
			return a[index];
		}
		int min = min(a, index + 1);
		if(a[index] < min){
			return a[index];
		}
		else{
			return min;
		}
	}

}


public class Book8_237_4 {

	public static void main(String[] args) {
		// repeated value check recursion method, 2 options

		int[] arr = { 2, 9, 7, 4, 8 };
		int index = 0;
		checkRepetition(arr, index);
		System.out.println("Are there any equal values in this array?: "+isRepeated(arr, index));
		

	}

	static void checkRepetition(int[] arr, int index) {
		for (int checkIndex = 1; checkIndex < arr.length; checkIndex++) {
			if (index != checkIndex && arr[index] == arr[checkIndex]) {
				System.out.println("There are repeated values in this array!");
				return;
			}
		}
		if (index == arr.length - 2) {
			System.out.println("There are no repeated values in this array!");
		} else {
			checkRepetition(arr, index + 1);
		}
	}

	
	
	static boolean isRepeated(int[] a, int index) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[index] && i != index) {
				return true;
			}
		}
		if (index < a.length - 1) {
			return isRepeated(a, index + 1);
		} else {
			return false;
		}

	}
	

}

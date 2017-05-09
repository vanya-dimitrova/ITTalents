
public class Book8_3NewArrayMethod {

	public static void main(String[] args) {
		// New Array Method

		int[] arr = { 2, 5, 6, 3, 5, 8 };
		int[] arr2 = { 3, 6, 7, 4, 6, 9 };
		for (int i = 0; i < copyInOne(arr, arr2).length; i++) {
			System.out.print(copyInOne(arr, arr2)[i]+",");

		}

	}

	static int[] copyInOne(int[] arr, int[] arr2) {
		int sum = arr.length + arr2.length;
		int[] newMasiv = new int[sum];

		for (int i = 0; i < newMasiv.length; i++) {
			if (i >= arr.length) {
				newMasiv[i] = arr2[i - arr2.length];
			}
			else{
				newMasiv[i] = arr[i];
			}
		}
		return newMasiv;

	}
}

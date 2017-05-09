
public class Task12SwapValues {

	public static void main(String[] args) {

		int[] arr = { 3, 56, 7, 34, 89, 6, 23 };
		int temp = 0;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		arr[4] = arr[4]*arr[5];
		arr[5] = arr[4]/arr[5];
		arr[4] = arr[4]/arr[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}

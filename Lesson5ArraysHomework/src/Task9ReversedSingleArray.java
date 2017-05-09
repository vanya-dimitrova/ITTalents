
public class Task9ReversedSingleArray {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 23, 56, 3, 78, 66 };

		int x = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[x];
			arr[x] = temp;
			x--;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+",");
		}

	}

}

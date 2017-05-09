
public class Book6_231_4 {

	public static void main(String[] args) {
		// the longest length of equal values

		int[] arr = { 2, 4, 3, 5, 3, 5, 6, 3, 6, 3 };

		int max = 0;
		int counter = 1;
		int tempIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1 && arr[i] == arr[i + 1]) {
				if (counter > max) {
					max = counter;
					tempIndex = i;
				}
				counter++;
			}
			if (i != arr.length - 1 && arr[i] != arr[i + 1]) {
				counter = 1;
			}
		}
		for (int i = 0; i < max; i++) {
			if (max != 0) {
				System.out.print(arr[tempIndex] + ", ");
				if (i == max - 1) {
					System.out.println(arr[tempIndex]);
				}
			}
		}
		if (max == 0) {
			System.out.println("There is no equal values in a row!");

		}

	}

}

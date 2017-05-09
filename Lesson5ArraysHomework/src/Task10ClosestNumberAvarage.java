
public class Task10ClosestNumberAvarage {

	public static void main(String[] args) {

		int[] arr = { 9, 10, 11, 12, 13, 14, 15 };
		int sum = 0;
		double temp = 0;
		double avarage = 0;
		int index = 0;;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			avarage = sum / arr.length;
			temp = arr[i] - avarage;
			if (temp < 0) {
			temp *= -1;
			index = i;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			double diff = arr[j] - avarage;
			if (diff < 0) {
				diff *= -1;
			}
			if(diff < temp){
				temp = diff;
				index = j;
			}
		}
		System.out.println(arr[index]);

	}

}

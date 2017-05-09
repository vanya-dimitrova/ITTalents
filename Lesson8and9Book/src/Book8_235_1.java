
public class Book8_235_1 {

	public static void main(String[] args) {
		// avarage value in array method
		
		int[] arr = { 2, 5, 6, 3, 5, 8 };
		
		System.out.println(findAverage(arr));

	}
	static double findAverage(int[] arr){
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum/arr.length;
	}

}

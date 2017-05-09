import java.util.Arrays;

public class KrasiSwapNumbersInArray {

	public static void main(String[] args) {
		
		int[] masiv = {4,9};
		System.out.println(Arrays.toString(masiv));
		swap(masiv);
		System.out.println(Arrays.toString(masiv));
	}
	
	static void swap(int[] arr){
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
}

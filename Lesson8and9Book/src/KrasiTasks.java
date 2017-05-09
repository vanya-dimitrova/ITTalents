import java.util.Random;

public class KrasiTasks {

	public static void main(String[] args) {
		
		int[] masiv = generateArray(10);
		printArray(masiv);
		
	}
	
	static int[] generateArray(int n){
		int[] arr = new int[n];
		//do some magic here
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10);
		}
		return arr;
	}
	
	static void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

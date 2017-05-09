import java.util.Arrays;

public class KrasiTask4 {

	public static void main(String[] args) {
		
		int[] arr = {0,1,1,0,1,0,0,1,1,0,1,0,1,0,1,0,1,1};
		
		//count zeroes
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0){
				counter++;
			}
		}
		
		for (int i = 0; i < counter; i++) {
			arr[i] = 0;
		}
		
		for(int i = counter; i < arr.length; i++){
			arr[i] = 1;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}

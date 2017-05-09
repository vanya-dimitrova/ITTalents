
public class Task2HalfReversedArray {

	public static void main(String[] args) {
		
		int[] arr = {3, 5, 7, 9, 11, 13};
		int[] arrnew = new int[arr.length];
		
		for(int i = 0; i < arr.length/2; i++){
			arrnew[i] = arr[i];
			System.out.print(arrnew[i]+" ");
		}
		for(int i = arr.length - 1; i >= arr.length/2; i--){
			arrnew[i] = arr[i];
			System.out.print(arrnew[i]+" ");
		
		}
			
		
		

		
		

	}

}

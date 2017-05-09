import java.util.Arrays;

public class KrasiCopyArrays {

	public static void main(String[] args) {
		
		int[] original = {5,8,56,4,67,6,35,4,35,4};
		
		int[] copy = new int[original.length];
		for(int i = 0; i < copy.length; i++){
			copy[i] = original[i];
		}
		
		System.out.print("[");
		for(int i = 0; i < copy.length; i++){
			if(i == copy.length-1){
				System.out.print(copy[i]);
			}
			else{
				System.out.print(copy[i] + ", ");
			}
		}
		System.out.println("]");
		
		System.out.println(Arrays.toString(copy));
		
	}
}

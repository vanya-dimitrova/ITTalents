import java.util.Scanner;

public class Book6_230_2 {

	public static void main(String[] args) {
		// palindrome
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length:");
		int length = sc.nextInt();
		int[] arr = new int[length];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter array value for position "+(i + 1));
			arr[i] = sc.nextInt();
		}
		int compareIndex = length - 1;
		for (int i = 0; i < arr.length/2; i++) {
			if(arr[i] != arr[compareIndex]){
				System.out.println("Array is not palindrome!");
				break;
			}
			compareIndex--;
			if(i == arr.length/2 - 1){
		       System.out.println("Array is palindrome");
			}
		}
		
		
sc.close();
	}

}

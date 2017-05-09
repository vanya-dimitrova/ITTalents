import java.util.Scanner;

public class Task13ConvertToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int pasteNumber = number;
		
		int counter = 0;
		int digit = 0;
		while(number >= 1){
		    digit = number%2;
			number/=2;
			counter++;
		}
		int[] arr = new int[counter];
		for (int i = arr.length - 1; i >= 0; i--) {
			digit = pasteNumber%2;
			pasteNumber/=2;
			arr[i] = digit;
			System.out.print(arr[i]);
		}
		sc.close();
	}

	
}

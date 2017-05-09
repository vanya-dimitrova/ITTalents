import java.util.Scanner;

public class Task11DivideByFive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 7 numbers:");
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%5 == 0 && arr[i] > 5){
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();

	}

}

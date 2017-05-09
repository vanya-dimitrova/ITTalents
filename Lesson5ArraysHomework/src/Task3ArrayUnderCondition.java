import java.util.Scanner;

public class Task3ArrayUnderCondition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number N:");
		int n = sc.nextInt();
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length - 8; i++){
			arr[i] = n;
			System.out.print(arr[i]+" ");
		}
		for(int i = arr.length - 8; i < arr.length; i++){
			arr[i] = arr[i-2] + arr[i -1];
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}

import java.util.Scanner;

public class Task1SmallestDivide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter lenght value for the array:");
		int lenght = sc.nextInt();

		int[] arr = new int[lenght];
		System.out.println("Enter array values:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.print(arr[i]);
		}
		System.out.println();
		//int min = 0;
		for (int i = 0; i < arr.length - 1; i++){
		// triabva da ia dovursha che ia razburkah
		}
		sc.close();

	}

}

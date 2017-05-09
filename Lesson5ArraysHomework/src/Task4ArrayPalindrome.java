import java.util.Scanner;

public class Task4ArrayPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int lenght = 0;
		do {
			System.out.println("Enter even number for array lenght:");
			lenght = sc.nextInt();
		} while (lenght < 0 || lenght % 2 != 0);

		int arr[] = new int[lenght];
		int i = 0;
		int a = 0;
		System.out.println("Enter array values");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int arrnew[] = new int[arr.length];
		for (i = arr.length - 1; i >= 0; i--) {
			arrnew[a] = arr[i];
			System.out.println(arrnew[a]);
			a++;
		}
		a = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] != arrnew[a]) {
				System.out.println("Array values are not in mirror vision!");
				break;
			} else if (arr[i] == arrnew[a]) {
				a++;
			}
			if (arr[i] == arr.length - 1)
				System.out.println("Array values are in mirror vision!");
		}

		sc.close();
	}

}

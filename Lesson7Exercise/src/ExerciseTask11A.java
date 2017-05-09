import java.util.Scanner;

public class ExerciseTask11A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int m = 0;
		do{
		System.out.println("Enter positive number for n:");
		n = sc.nextInt();
		System.out.println("Enter positive number for m:");
		m = sc.nextInt();
		}
		while(n < 0 || m < 0);
		
		int[][] arr = new int [n][m];
		int a = 1;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				arr[i][j] = a;
				System.out.print(arr[i][j]+",");
				a++;
			}
			System.out.println();
		}
		sc.close();

	}

}

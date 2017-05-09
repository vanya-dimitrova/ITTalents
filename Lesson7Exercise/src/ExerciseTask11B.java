import java.util.Scanner;


public class ExerciseTask11B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		do{
		System.out.println("Enter a positive number for n:");
		n = sc.nextInt();
		System.out.println("Enter a positive number for m:");
		m = sc.nextInt();
		}
		while(n < 0 || m < 0);
		
		int arr[][] = new int [n][m];
		int a = 1;
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[0].length; col++ ){
				arr[row][col] = a;
				System.out.print(arr[row][col]+",");
				a+=n;
			}
			System.out.println();
			a-=m*n;
			a++;
		
		}
		sc.close();
		

	}

}

import java.util.Scanner;

public class Task8Zavisimost {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int print = n;
		
		for(int i = 1; i <= n; i++ ){
			for(int j = 1; j <= n; j++){
			System.out.print(print -1);
		}
			print+=2;
			System.out.println();
		}
		
		
		
		sc.close();

	}

}

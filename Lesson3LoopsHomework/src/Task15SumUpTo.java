import java.util.Scanner;

public class Task15SumUpTo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n;
		int sum = 0;
		do{
			System.out.println("Enter number bigger than 1:");
			n = sc.nextInt();
		}
		while (n < 2);
		
		for(int i = 1; i <= n; i++){
			sum+=i;
		}
		System.out.println(sum);
		sc.close();
		

	}

}

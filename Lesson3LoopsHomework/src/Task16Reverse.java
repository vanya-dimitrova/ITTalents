import java.util.Scanner;

public class Task16Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		int m;
		do{
			System.out.println("Enter two positive numbers between 10 and 5555:");
			n = sc.nextInt();
			m = sc.nextInt();
		}
		while(n < 10 || m > 5555);
		
		for(int i = m; i >= n; i--){
			if(i%50 == 0){
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}

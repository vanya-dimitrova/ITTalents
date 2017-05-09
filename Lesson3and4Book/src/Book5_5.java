import java.util.Scanner;


public class Book5_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number P:");
		int p = sc.nextInt();
		System.out.println("Enter number Q:");
		int q = sc.nextInt();
		int znak = 11;
		int znakUvelichen = 11;
		
		for(int i = 1; i <= p; i++){
			for(int j = 1; j <= q; j++){
				System.out.print(znak);
				znak++;
			}
			System.out.println();
			znak =znakUvelichen + 10;
			znakUvelichen+=10;
			
		}
		sc.close();
	}

}

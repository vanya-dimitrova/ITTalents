import java.util.Scanner;

public class Book3_223_6 {

	public static void main(String[] args) {
		// convert bits
		// myself
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = 1<< b;
		int e = 1 << c;
		
		a = a ^ d ^ e;
		System.out.println(a);
		
		sc.close();

	}

}

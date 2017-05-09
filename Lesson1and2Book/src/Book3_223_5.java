import java.util.Scanner;

public class Book3_223_5 {

	public static void main(String[] args) {
		// povdigni bitovete
		// sama si ia napravih
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = 1;
		int dA = d << a;
		int dB = d << b;
		int dC = d << c;
		
		d = dA | dB | dC;
		System.out.println(d);
		
		
		sc.close();

	}

}

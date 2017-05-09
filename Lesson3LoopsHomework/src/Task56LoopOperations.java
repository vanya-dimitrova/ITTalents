import java.util.Scanner;

public class Task56LoopOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println();
		System.out.println("To see all numbers between two numbers:");
		System.out.println("");
	
		System.out.println("Enter any two digit number:");
		int a = sc.nextInt();
		System.out.println("Enter another two digit number:");
		int b = sc.nextInt();
		
		while (a<=b){
			System.out.println(a);
			a++;	
		}
		while  (b<=a){
			System.out.println(b);
			b++;
		}
		int c = sc.nextInt();
		int d = 0;
		while (c>0){
			c--;
		d += c;
	}
		System.out.println(d);
	
		sc.close();

	}

}

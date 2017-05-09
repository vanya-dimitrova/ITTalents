import java.util.Scanner;

public class Task24Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number:");
		int number = sc.nextInt();
		
		int f = number/10000;
		System.out.println(f);
		int s = (number/1000)%10;
		System.out.println(s);
		int t = (number/100)%10;
		System.out.println(t);
		int fo = (number/10)%10;
		System.out.println(fo);
		int fi = number%10;
		System.out.println(fi);

		
		sc.close();

	}

}

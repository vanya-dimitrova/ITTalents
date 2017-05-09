import java.util.Scanner;

public class Task6ExchangeValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter three numbers for a1; a2 and a3 in the same sequence:");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		System.out.println("Now you can see them mismatched: ");
		int a4 = a1;
		a1 = a2;
		a2 = a3;
		System.out.println("a1="+a1+"; a2="+a2+"; a3="+a4);
		sc.close();
	}

}

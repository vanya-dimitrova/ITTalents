import java.util.Scanner;

public class KrasiTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some text");
		
		String c = sc.nextLine();
		
		System.out.println("the char is " + c.charAt(c.length() - 1));
		sc.close();
	}
}

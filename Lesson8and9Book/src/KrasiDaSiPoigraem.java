import java.util.Scanner;

public class KrasiDaSiPoigraem {

	public static void main(String[] args) {
		
		int p = 5;
		String x1 = "Gabi";
		String x2 = "Gabi";
		System.out.println(x1 == x2);
		
		String y1 = new String("Gabi");
		String y2 = new String("Gabi");
		System.out.println(y1 == y2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter some text");
		String text1 = sc.next();
		String text2 = sc.next();
		String text3 = sc.next();
		System.out.println("You have entered 1 : " + text1);
		System.out.println("You have entered 2 : " + text2);
		System.out.println("You have entered 3 : " + text3);
		sc.close();
	}
}

import java.util.Scanner;

public class KrasiEpicSquare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the side of the square");
		int side = sc.nextInt();
		int area = side*side;
		System.out.println("The area of the square is " + area);
		sc.close();
	}
}

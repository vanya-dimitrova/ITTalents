import java.util.Scanner;

public class Task14ChessBoardColors {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("To check if two squares are in same colour on tne chessboard:");
		System.out.println("");
		System.out.println("First square:");
		System.out.print("Please enter vertical parameter(in digits): ");
		int a = sc.nextInt();
		System.out.println("Please enter horizontal parameter(in digits): ");
		int b = sc.nextInt();
		
		System.out.println("Second square:");
		System.out.print("Vertical parameter(in digits): ");
		int c = sc.nextInt();
		System.out.print("Horizontal parameter(in digits): ");
		int d = sc.nextInt();
		System.out.println("");
		
		if (((a+b)%2 == 0 && (c+d)%2 == 0) || ((a+b)%2 == 1 && (c+d)%2 == 1)){
			System.out.println("Squares are in same colour!");
		} else if (((a+b)%2 == 1 && (c+d)%2 == 0) || ((a+b)%2 == 0 && (c+d)%2 == 1)){
			System.out.println("Squares are not in same colour.");
		}
		sc.close();

	}

}

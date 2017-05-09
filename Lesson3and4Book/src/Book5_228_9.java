import java.util.Scanner;

public class Book5_228_9 {

	public static void main(String[] args) {
		// draw a triangle of stars
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tree heigth:");
		int heigth = sc.nextInt();
		
		int c = heigth;
		int d = heigth;
		for (int i = 0; i < heigth; i++) {
			for (int j = 0; j < c; j++) {
				if(j < d -1){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
			c++;
			d--;
		}
		sc.close();

	}

}

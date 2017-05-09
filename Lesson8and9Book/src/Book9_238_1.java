import java.util.Scanner;

public class Book9_238_1 {

	public static void main(String[] args) {
		// string upper and lower case
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word with no more than 40 signs:"); 
			String a = sc.nextLine();
			int counter = 0;
			for (int i = 0; i < a.length(); i++) {
				counter++;
			}
			while(counter > 40){
				System.out.println("Enter a word with no more than 40 signs:"); 
				a = sc.nextLine();
			}
			System.out.println("Enter one more word with no more than 40 signs:");
			String b = sc.nextLine();
			counter = 0;
			for (int i = 0; i < a.length(); i++) {
				counter++;
			}
			while(counter > 40){
				System.out.println("Enter one more word with no more than 40 signs:"); 
				b = sc.nextLine();
				
			}
			String newA = a.toUpperCase();
			String newAA = a.toLowerCase();
			System.out.println(newA+"  "+newAA);
			
			String newB = b.toUpperCase();
			String newBB = b.toLowerCase();
			System.out.println(newB+"  "+newBB);
		
			sc.close();
	}

}

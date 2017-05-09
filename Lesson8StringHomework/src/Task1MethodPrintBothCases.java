import java.util.Scanner;

public class Task1MethodPrintBothCases {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text1;
		String text2;
		do{
			System.out.println("Enter up to 40 letters in capital and lower cases:");
			text1 = sc.nextLine();
			System.out.println("Enter up to 40 letters in capital and lower cases:");
			text2 = sc.nextLine();
		}
		while(text1.length() > 40 || text2.length() > 40);
		printBothCases(text1);
		printBothCases(text2);
		
		sc.close();
		
		


	}
	static void printBothCases(String x){
		System.out.print(x.toUpperCase()+" ");
		System.out.println(x.toLowerCase());
		
		
	}

}

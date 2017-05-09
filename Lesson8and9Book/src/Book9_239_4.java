import java.util.Scanner;

public class Book9_239_4 {

	public static void main(String[] args) {
		// string palindrome
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		boolean palindrome = true;
		for (int i = 0; i < a.length()/2; i++) {
			if(a.charAt(i) != a.charAt(a.length() - 1 - i)){
				palindrome = false;
				break;
			}
		}
		System.out.println(palindrome? "Palindrome" : "Not palindrome");
		
		
		
		
		sc.close();
		
		
	}
}
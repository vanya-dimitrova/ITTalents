import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = sc.next();
		StringBuilder newText = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char sign = (char)((int)text.charAt(i) + 5);
			newText.insert(i, sign); 
		}
		System.out.println(newText);
		sc.close();
	
	}
}

import java.util.Scanner;

public class Task7CountWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter text:");
		String text = sc.nextLine();
		System.out.println(text);
		counting(text);
		
		sc.close();

	}

	static void counting(String a) {
		int wordCount = 1;
		int letterCount = 0;
		int maxLenght = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != ' ' && a.charAt(i) != '.') {
				letterCount++;
			}
			if (letterCount > maxLenght) {
				maxLenght = letterCount;
			}
			if (a.charAt(i) == ' ') {
				wordCount++;
				letterCount = 0;
			}
		}
		System.out.println(wordCount + " words, the longest word has " + maxLenght + " letters.");
		
	}

}

import java.util.Scanner;

public class Book9_1MakeWord {

	public static void main(String[] args) {
		// make word

		String a = validateString();
		System.out.print(a+"; ");
		String b = validateString();
		System.out.println(b);
		
		String newWord = makeNewString(a, b);
		String newWord2 = makeNewString(b, a);
		if(newWord.length() > newWord2.length()){
			System.out.print(newWord.length()+", "+newWord);
		}
		else{
			System.out.print(newWord2.length()+", "+newWord2);
		}
	

	}

	static String validateString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word with no more than 20 letters:");
		String word = sc.nextLine();
		while (word.length() > 15) {
			System.out.println("Enter a word with no more than 20 letters:");
			word = sc.nextLine();
			sc.close();
		}
		return word;

	}

	static String makeNewString(String a, String b) {
		String c = a.substring(0, 5) + b.substring(5);
		return c;
	}


}

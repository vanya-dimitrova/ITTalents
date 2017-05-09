import java.util.Scanner;

public class Book9_3CrossLetters {

	public static void main(String[] args) {
		// cross letters

		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String b = sc.nextLine();
        
		char equal = ' ';
		int indexA = 0;
		int indexB = 0;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					indexA = i;
					indexB = j;
					break;
				}
			}
		}
		if (equal == ' ') {
			System.out.println("These words have no equal letter!");
		} else {
			for (int i = 0; i < b.length(); i++) {
				for (int j = 0; j < a.length(); j++) {
					if (j == indexA) {
						System.out.print(b.charAt(i));
					}
					if (i == indexB && j != indexA) {
						System.out.print(a.charAt(j));
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}

		}

		sc.close();
	}

}

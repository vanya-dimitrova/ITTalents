import java.util.Scanner;

public class Task3StringIndexOf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String word1 = sc.next();
		System.out.println("Enter a second word:");
		String word2 = sc.next();
		

		for(int i = 0; i < word1.length(); i++){
			word1.indexOf(word2);
			if(word1.charAt(i) != word2.charAt(i)){
				System.out.println(i+" "+word1.charAt(i)+"-"+word2.charAt(i));
			}
		}
		sc.close();
	}

}

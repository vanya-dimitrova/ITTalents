import java.util.Scanner;

public class Book9_2CompareString {

	public static void main(String[] args) {
		// compare string
		
		Scanner sc = new Scanner(System.in);
		String a;
		String b;
		int i;
		int j;
		do{
			System.out.println("Enter word:");
			a = sc.nextLine();
			System.out.println(a);
			for (i = 0; i < a.length(); i++) {
				if(a.charAt(i) == ' '){
					break;
				}
			}
			System.out.println("Enter one more:");
			b = sc.nextLine();
			System.out.println(b);
			for (j = 0; j < b.length(); j++) {
				if(b.charAt(j) == ' '){
					break;
				}
			}
		}
		while(i < a.length() || j < b.length());
		
		String longWord = a;
		String shortWord = b;
		if(a.length() > b.length()){
		longWord = a;
		shortWord = b;
		System.out.println(a+" is longer than "+b);
		}
		else if(b.length() > a.length()){
		longWord = b; 
		shortWord = a;
		System.out.println(a+" is shorter than "+b);
		}
		else{
			System.out.println("Words have equal length!");
		}
		for (int k = 0; k < shortWord.length(); k++) {
			if(longWord.charAt(k) != shortWord.charAt(k)){
				System.out.println((k + 1)+", "+a.charAt(k)+"-"+b.charAt(k)); 
				
			}
		}
		sc.close();

	}

}

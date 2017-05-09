import java.util.Scanner;

public class Task2StringReplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word1;
		String word2;
		do{
			System.out.println("Enter first word between 10 and 20 letters:");
			word1 = sc.next();
			System.out.println("Enter second word between 10 and 20 letters:");
			word2 = sc.next();
		}
		while(word1.length() < 10 || word1.length() > 20 || word2.length() < 10 || word2.length() > 20);
		
		String fiveIndex1 = word1.substring(0,5);
		String fiveIndex2 = word2.substring(0,5);
		String newWord1 = word1.replace(fiveIndex1, fiveIndex2);
		String newWord2 = word2.replace(fiveIndex2, fiveIndex1);
		
		int result = newWord1.compareTo(newWord2);
		if(result > 0){
			System.out.println(newWord1.length()+" "+newWord1);
		}
		else{
			System.out.println(newWord2.length()+" "+newWord2);
		}
			
		
		
		sc.close();
			
		

	}

}

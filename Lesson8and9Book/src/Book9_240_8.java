import java.util.Scanner;

public class Book9_240_8 {

	public static void main(String[] args) {
		// index of char
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text with each sign different:");
		String a = sc.nextLine();
		boolean equal = false;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if(i != j && a.charAt(i) == a.charAt(j)){
					equal = true;
					break;
				}
			}
		}
		while(equal == true){
			System.out.println("Enter text with each sign different:");
			a = sc.nextLine();
			equal = false;
			for (int i = 0; i < a.length(); i++) {
				for (int j = 0; j < a.length(); j++) {
					if(i != j && a.charAt(i) == a.charAt(j)){
						equal = true;
						break;
					}
				}
			}
		}
		System.out.println("Enter one more text:");
		String b = sc.nextLine();
		
		int counter = 0;
		int c = 0;
		char[] arr = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if(a.charAt(i) == b.charAt(j)){
					counter++;
				}
			}
			if(counter == 0){
				arr[c] = a.charAt(i);
				c++;
			}
			counter = 0;
		}
		for (int i = c; i < arr.length; i++) {
			arr[i] = ' ';
			
		}
		System.out.println("Text b does not contain the following signs from text a:");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ' '){
				continue;
			}
			System.out.print(arr[i]+";");
		}
		
		sc.close();
		

	}

}

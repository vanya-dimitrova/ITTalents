
public class Book9_239_5 {

	public static void main(String[] args) {
		// increase with 5 from ASCI
		
		StringBuilder a = new StringBuilder("text");
		System.out.println(a);

		for (int i = 0; i < a.length(); i++) {
			char b = (char)((int)a.charAt(i) + 5);
			
			System.out.print(b);
		}
		

	}

}

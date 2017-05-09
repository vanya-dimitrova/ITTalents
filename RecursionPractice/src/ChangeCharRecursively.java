
public class ChangeCharRecursively {

	public static void main(String[] args) {
		// Change Char Recursively
		
		String a = "Learn what pi piis";
		int index = 0;
		System.out.println(changeChar(a, index));

	}
	static StringBuilder changeChar(String a, int b){
		StringBuilder z = new StringBuilder(a);
		if(b == a.length()){
			return z;
			}
		z = changeChar(a, b + 1);
		if(b < a.length() && z.charAt(b) == 'p' && z.charAt(b + 1) == 'i'){
			z.replace(b, b + 2, "3,14");
			return z;
		}
		return z;	
			
	}
	

}

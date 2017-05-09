

public class KrasiMethodExamples {
	
	public static void main(String[] args) {
		int e = substractNumbers(5, 8);
		int x = 5;
		greet("Ivo");
		int y = 8;
		int sbor = substractNumbers(y, x);

		greet("Zara");
		greet("Boiko");
		int z = 131;
		int vtoraSuma =substractNumbers(z, sbor);
		
		greet("Gabi");
		greet(" ");
	}
	
	static void greet(String name){
		if(name.trim().isEmpty()){
			return;
		}
		if(name.equals("Gabi") || name.equals("Zara")){
			 System.out.println("Hello, Mrs. " + name + ", how are you today?");
		}
		else{
			 System.out.println("Hello, Mr. " + name + ", how are you today?");
		}
	}
	
	static int substractNumbers(int a, int b){
		int suma = a - b;
		return suma;
	}
	
	
}

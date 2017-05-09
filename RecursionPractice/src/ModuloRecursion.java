
public class ModuloRecursion {

	public static void main(String[] args) {
		// Modulo recursion
		
		int a = 235;
		int den = 10;
		System.out.print(remainder(a, den));

	}
	static int remainder(int num, int den){
		return num - den*(num/den);
	}

}

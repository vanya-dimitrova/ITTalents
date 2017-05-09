
public class Book8_238_10 {

	public static void main(String[] args) {
		// x power of method 

		int a = 4;
		int b = 5;
		int result = 0;
		System.out.println(multiply(a, b));
		
	

	}

	static int powerOf(int a, int b) {
		if (b == 1) {
			return a;
		}
		int prednaStepen = powerOf(a, b - 1);
		int sbor = 0;
		for (int i = 0; i < a; i++) {
			sbor+=prednaStepen;
		}
		return sbor;
		

	}

	static int multiply(int a, int b) {
		if (b == 1) {
			return a;
		}
			int result = multiply(a, b -1);
			result+=a;
			return result;
		
		}

	


}

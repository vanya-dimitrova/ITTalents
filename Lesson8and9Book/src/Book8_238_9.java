
public class Book8_238_9 {

	public static void main(String[] args) {
		// multiply with + recursion method, 2 options
		
		int a = 4;
		int b = 4;
		int resultA = a;
		System.out.println(a+"*"+b+" is "+multiply(a, b, resultA));
		System.out.println(multi(a, b));

	}
	static int multiply(int a, int b, int resultA){
		if(b > 1){
			resultA+=a;
			return multiply(a, b - 1, resultA);
		}
		else{
			return resultA;
		}
	}
	static int multi(int a, int b){
		if(b == 1){
			return a;
		}
		int result = multi(a, b - 1);
		result+=a;
		
		return result;
	}
	

}


public class PowerRecursivelyAditionOnlyMethodInMethod {

	public static void main(String[] args) {
		// power recursively with addition only
		int a = 5;
		int b = 3;
		System.out.println(power(a, b));

	}
	static int power(int a, int b){
		if(b == 0){
			return 1;
		}
		if(b == 1){
			return a;
		}
		return multi(power(a, b - 1), a);
		
	}
	
	static int multi(int a, int b){
		if(a == 0 || b == 0){
			return 0;
		}
		if(b == 1){
			return a;
		}
		return a + multi(a, b - 1);
	}

}

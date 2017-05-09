
public class Count8Recursively {

	public static void main(String[] args) {
		// Count digit 8 Recursively
		
		int a = 688282888;
		System.out.println(count8(a));

	}
	static int count8(int a){
		if(a < 10 && a != 8){
			return 0;
		}
		if(a < 10 && a == 8){
			return 1;
		}
		int counter = count8(a/10);
		int digit = a%10;
		if(a%100 == 88){
			return ++counter + 1;
		}
		if(digit == 8){
			return ++counter;
		}else{
		    return counter;
		}
	}

}

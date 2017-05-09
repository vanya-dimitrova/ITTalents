
public class Book3_5 {

	public static void main(String[] args) {
		// check how many bits are equal between 2 numbers
		
		int a = 57;
		int b = 46;
		int counter = 0;
		int result = 0;
		int length = countBits(b, counter);
		for (int i = 0; i < length; i++) {
			result = takeBit(a)^takeBit(b);
			a/=2;
			b/=2;
			if(result == 0){
				counter++;
			}	
		}
		System.out.println("Numbers have "+counter+" equal bits.");

		
	}
	static int takeBit(int a){
		int bit = a%2;
			return bit;
		}
		
	static int countBits(int a, int counter){
		a/=2;
		counter++; 
		if(a == 0){
			return counter;
		}
		else{
			return countBits(a, counter);
		}
		
	}
		

}

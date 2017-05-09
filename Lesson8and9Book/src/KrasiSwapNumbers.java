
public class KrasiSwapNumbers {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 9;
		
		swap(x, y);
		System.out.println(x);
		System.out.println(y);
		
		for(;;){
			int a = 6;
			a++;
		}
		
	}
	
	static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	
}

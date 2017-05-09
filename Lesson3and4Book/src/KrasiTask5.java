
public class KrasiTask5 {

	public static void main(String[] args) {
		
		int x = 110;
		int umnojitel = 1;
		int number = 0;
		
		while(x > 0){
			int ostatuk = x%2;
			number = number + (ostatuk*umnojitel);
			umnojitel = umnojitel*10;
			System.out.print(ostatuk);
			x/=2;
		}
		System.out.println(); 
		
		System.out.println(number);
	}
}

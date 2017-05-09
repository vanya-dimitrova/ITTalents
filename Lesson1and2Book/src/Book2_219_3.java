import java.util.Scanner;

public class Book2_219_3 {

	public static void main(String[] args) {
		// ogledalno otpechatvane
		// myself
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int tDigit = a/100;
		int sDigit = (a - tDigit*100)/10;
		int fDigit = a%10;
		
		int number = fDigit*100 + sDigit*10 + tDigit;
		System.out.println(number); 
		
		sc.close();
		
		
	}

}

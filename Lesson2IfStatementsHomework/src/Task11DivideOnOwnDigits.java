import java.util.Scanner;

public class Task11DivideOnOwnDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int lastDigit = a%10;
		int base = (a - lastDigit)/10;
		int secondDigit = base%10;
		int firstDigit = (base - secondDigit)/10;
		
	if (a%firstDigit == 0){
		System.out.println(a+" can be divided by "+firstDigit);
	} else {
		System.out.println(a+" can not be divided by "+firstDigit);
	}
	if (a%secondDigit == 0){
		System.out.println(a+" can be divided by "+secondDigit);
	} else {
		System.out.println(a+" can not be divided by "+secondDigit);
	}
	if (a%lastDigit == 0){
		System.out.println(a+" can be divided by "+lastDigit);
	} else {
		System.out.println(a+" can not be divided by "+lastDigit);
	}
	sc.close();

	}

}

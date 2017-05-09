import java.util.Scanner;

public class Task16NumberDigitsComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter three digits number to check if");
		System.out.println("they are equal, accending or descending:");
		int number = sc.nextInt();
		
		int thirdDigit = number%10;;
		int secondDigit = ((number - thirdDigit)/10)%10;
		int firstDigit = (((number - thirdDigit)/10) - secondDigit)/10;
		
		if (thirdDigit == secondDigit && secondDigit == firstDigit){
			System.out.println("Digits are equal.");
		} else if (thirdDigit > secondDigit && secondDigit > firstDigit){
			System.out.println("Digits are accending.");
		} else if (thirdDigit < secondDigit && secondDigit < firstDigit){
			System.out.println("Digits are descending.");
		} else {
			System.out.println("Digits are not in a definable order.");
					
			
		}
		sc.close();
		}
}

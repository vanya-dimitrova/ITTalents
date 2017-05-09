
public class Task12DifferentDigits {

	public static void main(String[] args) {
		
		for (int number = 100; number <=999; number++){
			
			int firstDigit = number/100;
			int midvalue = number%100;
			int secondDigit = midvalue/10;
			int thirdDigit = midvalue%10;
			
			if (firstDigit == secondDigit || secondDigit == thirdDigit){
				continue;
			} else if (firstDigit == thirdDigit){
				continue;
			}
				System.out.println(number);
		}
				
		

	}

}

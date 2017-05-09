import java.util.Scanner;

public class Task13DigitsSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number between 2 and 27:");
		int sum = sc.nextInt();
		
		while(sum <2 || sum > 27){
			System.out.println("Enter valid number");
			sum = sc.nextInt();
		}
		for(int number = 100; number <=999; number++){
			int firstDigit = number/100;
			int secondDigit = (number - firstDigit*100)/10;
			int thirdDigit = number%10;	
			
			if((firstDigit + secondDigit + thirdDigit) == sum){
				System.out.println(number);
			}
		}
		sc.close();
		
	}

}

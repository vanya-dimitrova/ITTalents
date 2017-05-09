import java.util.Scanner;

public class Book4_224_1 {
	
	public static void main(String[] args){
		// if number divides every digit
		
		Scanner sc = new Scanner(System.in) ;
		
		int number = sc.nextInt();
		
		int digit1 = number/100;
		int digit2 = (number - digit1*100)/10;
		int digit3 = number%2;
		
		if(digit1 == 0 || digit2 == 0 || digit3 == 0){
			System.out.println("Wrong number!");
		}
		else if(number%digit1 == 0 && number%digit2 == 0 && number%digit3 == 0){
			System.out.println("Number divides by every of its digits!");
		}
		else{
			System.out.println("Number does not divide by every of its digits!");
		}
		
			sc.close();
			
		
		
		
		
		
		
		
	}
}


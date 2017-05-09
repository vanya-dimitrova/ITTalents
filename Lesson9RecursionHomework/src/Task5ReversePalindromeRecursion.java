import java.util.Scanner;

public class Task5ReversePalindromeRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int x = sc.nextInt();
		int number = 0;
		System.out.println(reverse(x, number));
		if(reverse(x, number)== x){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
		sc.close();
		
	}
	static int reverse(int n, int number) {
		int digit = n%10;
		number = (number + digit)*10;
			if(n > 10){
				return reverse(n/10, number);
			}
			number/=10;
			return number;
			
		}

}
import java.util.Scanner;

public class Book5_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		boolean prime = true;
		
		for(int i = 2; i <number; i++){
			int ostatuk = number%i;
			i++;
			if(ostatuk == 0){
				prime = false;
				break;
			}
		}
		if(prime){
			System.out.println("The number is prime.");
		}
			else{
				System.out.println("The number is not prime.");
			}
		
		sc.close();

	}
	

}

import java.util.Scanner;

public class Book3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int number = 0;
		System.out.println("Enter number:");
		do{
			number = sc.nextInt();
		}
		while(number <=31);
		
		int bitFive = 0;
		for(int i = 0; i <=5; i++){
			bitFive = number%2;
			number = (number - bitFive)/2;
			System.out.print(bitFive); 
			
		}
			if(bitFive == 0){
				System.out.println("The fifth byte is not 1.");
			}
			else{ 
				System.out.println("The fifth byte is 1.");

			}	
			sc.close();
	

	}

}

import java.util.Scanner;

public class Book5_228_8 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length for the square:");
		int length = sc.nextInt();
		System.out.println("Enter a sign to fill in the square:");
		int sign = sc.nextInt();
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if(i == 0 || i == length - 1){
					System.out.print("*");
				}
				else{
					if(j == 0 || j == length - 1){
						System.out.print("*");
					}
					else{
						System.out.print(sign);
					}
				}
			}
			System.out.println();
		} 
		sc.close();
		
	}

}

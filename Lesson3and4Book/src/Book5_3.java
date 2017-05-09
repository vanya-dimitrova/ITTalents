import java.util.Scanner;

public class Book5_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = 1;
		int sum = 0;
		
		for(number = sc.nextInt(); number >= 0; number-- ){
			sum +=number;
			System.out.println(sum);
		}
		sc.close();
	
	}

}

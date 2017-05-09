import java.util.Scanner;

public class Book3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int sum = 0;
		sc.close();
		for(int i = number; i >0; i/=2){
			int bynaryValue = i%2;
			sum +=bynaryValue;
		}
		System.out.println(sum);
		
	}

}

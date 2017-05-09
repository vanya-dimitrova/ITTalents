import java.util.Scanner;

public class Book2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		sc.close();
		boolean divideBySeven = true;
		if(number%7 != 0){
			divideBySeven = false;
		}
			System.out.println(divideBySeven);
		

	}

}

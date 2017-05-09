import java.util.Scanner;

public class Task25Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int fibonachi = 1;
		
		if(number >=0){
			for (int i = 0; i <= number; i++) {
				fibonachi*=i;
	   	    }
        }
		else{
			for (int i = number; i < 0; i++) {
				fibonachi*=i;
			}
		}
		System.out.println(number+"; "+fibonachi);
		sc.close();
	}

}

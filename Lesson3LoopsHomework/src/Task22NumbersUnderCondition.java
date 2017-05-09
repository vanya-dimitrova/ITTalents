import java.util.Scanner;

public class Task22NumbersUnderCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int count = 0;
		for(int i = number + 1; i < 100; i++){
			if(i%2 == 0 || i%3 == 0 || i%5 == 0){
				System.out.print(i+" ");
				count++;
			}
			if(count == 10){
				break;
			}
		}
		sc.close();

	}

}

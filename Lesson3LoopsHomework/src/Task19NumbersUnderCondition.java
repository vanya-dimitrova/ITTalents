import java.util.Scanner;

public class Task19NumbersUnderCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		while(number > 1){
			if(number%2 == 0){
				number*=0.5;
				System.out.print(number+" ");
			}else{
				number*=3;
				number++;
				System.out.print(number+" ");
			}
		//	}if(number == 1){
		//		break;
		//	}	
		}
				
		sc.close();

	}

}

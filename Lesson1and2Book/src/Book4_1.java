
import java.util.Scanner;

public class Book4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N1:");
		int N1 = sc.nextInt();
		System.out.println("Enter N2:");
		int N2 = sc.nextInt();
		
		System.out.println("Enter N3:");
		int N3 = sc.nextInt();
		if(N1 > N2 && N1 >N3){
			System.out.println("The biggest number is "+N1);
		}else if
			(N2 > N1 && N2 > N3){
				System.out.println("The biggest number is "+N2);
		}else{
					System.out.println("The biggest number is "+N3);
		}
		
		sc.close();

	}


}

import java.util.Scanner;

public class Task18MultificationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner ((System.in));
		
		System.out.println("Enter min multiplier:");
		int min = sc.nextInt();
		System.out.println("Enter max multiplier:");
		int max = sc.nextInt();
		
		for(int i = min; i <= max; i++){
			for(int j = min; j <= max; j++){
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		sc.close();
			
		
	}

}

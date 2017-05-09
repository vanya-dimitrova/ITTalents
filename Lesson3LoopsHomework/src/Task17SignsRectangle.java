import java.util.Scanner;

public class Task17SignsRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		char sign = '=';
		
		for(int i = 0; i <= n; i++){
			for(int a = 0; a <= n; a++){
				if(i == 0 || i == n){
					System.out.print("*");
				}else if(a == 0 || a == n){
					System.out.print("*");
				}else{
					System.out.print(sign);
				}
			}
			System.out.println();
		}
		sc.close();	
				
		
		

	}

}

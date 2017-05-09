import java.util.Scanner;

public class Task14Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = 0;
		do{
			System.out.println("Enter N > 10 and N < 200;");
		    n = sc.nextInt();
		}
		while(n < 10 || n > 200);
		
		for(int i = n; i >0; i--){
			int ostatuk = i%7;
			if(ostatuk == 0 && i != 7){
				System.out.print(i+", ");
			}
			if(i == 7){
				System.out.print(i);
			}	
			
		}
		sc.close();
		
		
		
	}

}

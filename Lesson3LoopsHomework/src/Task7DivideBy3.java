import java.util.Scanner;

public class Task7DivideBy3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int a = 3;
		while (a < x*3){
			System.out.print(a+",");
			a+=3;
		}
			System.out.println(a+3);
			sc.close();

	}

}

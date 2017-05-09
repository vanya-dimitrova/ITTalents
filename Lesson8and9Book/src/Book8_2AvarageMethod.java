import java.util.Scanner;

public class Book8_2AvarageMethod {

	public static void main(String[] args) {
		// Average method
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		System.out.println(average(a, b));
		
		sc.close();

	}
	static double average(double a, double b){
		double average = (a + b)/2;
		return average;
	}

}

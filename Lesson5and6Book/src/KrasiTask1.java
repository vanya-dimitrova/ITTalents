import java.util.Scanner;

public class KrasiTask1 {

	public static void main(String[] args) {
		
		//1 - input a positive number
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a positive number");
		int n = sc.nextInt();
		//2 - keep trying until positive
		while(n <= 0){
			System.out.println("abe vuvedi polijitelno, BE!");
			n = sc.nextInt();
		}
		//3 - create an array
		double[] chisla = new double[n];//creates n variables of type double
		//4 - set value
		//5 - print
		for(int i = 0; i < chisla.length; i++){
			chisla[i] = 7.62;
			System.out.println(chisla[i]);
		}
		sc.close();
		
	}
}

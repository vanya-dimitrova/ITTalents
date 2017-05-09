import java.util.Scanner;

public class Task9Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number A:");
		int a = sc.nextInt();
		System.out.println("Enter number B:");
		int b = sc.nextInt();
		int min = a;
		int max = b;
		int sbor = 0 + min * min;

		if (a > b) {
			System.out.println("Number A should be smaller than number B!");
		}
		for (min = a; min <= max; min++) {
			if (min % 3 == 0) {
				continue;
			}
			sbor += min * min;
			if (sbor > 200) {
				break;
			}
			System.out.print(min * min + ",");
			
			//tova sus zapetaikata na kraia ne znam kak da go opravia
			//bez da si opleskam koda
		}
		sc.close();
	}

}

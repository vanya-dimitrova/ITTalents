import java.util.Scanner;

public class Book4_226_7 {

	public static void main(String[] args) {
		// count days gone

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter date:");
		int date = sc.nextInt();
		System.out.println("Enter month:");
		int month = sc.nextInt();
		System.out.println("Enter year:");
		int year = sc.nextInt();

		int visok = 0;
		int days = 0;
		if ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) {
			visok = 1;
		}
		switch (month) {
		case 1:
			days = date;
			break;
		case 2:
			days = 31 + date;
			break;
			
		case 3:
			days = 59 + date + visok;
			break;
			
		case 4:
			days = 90 + date + visok;
			break;
			
		case 5:
			days = 120 + date + visok;
			break;
			
		case 6:
			days = 151 + date + visok;
			break;
			
		case 7:
			days = 181 + date + visok;
			break;
			
		case 8:
			days = 212 + date + visok;
			break;
			
		case 9:
			days = 243 + date + visok;
			break;
			
		case 10:
			days = 273 + date + visok;
			break;
			
		case 11:
			days = 304 + date + visok;
			break;
			
		case 12:
			days = 334 + date + visok;
			break;
		}
		System.out.println(days);
		
		sc.close();

	}

}

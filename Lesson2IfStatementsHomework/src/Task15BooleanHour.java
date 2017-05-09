import java.util.Scanner;

public class Task15BooleanHour {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("What's the time now?");
		int time = sc.nextInt();
		System.out.println("");
		
		switch (time){
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		System.out.println("Good morning!");
		break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
			System.out.println("Good afternoon!");
			break;
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 1:
		case 2:
		case 3:
			System.out.println("Good evening");
			break;
			default:
				System.out.println("Incorrect time!");
				break;
		}
			
		sc.close();
		

	}

}

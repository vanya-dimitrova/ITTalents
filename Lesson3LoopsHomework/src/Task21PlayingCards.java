import java.util.Scanner;

public class Task21PlayingCards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int card = sc.nextInt();

		for (int i = card - 1; i <= 51; i++) {
			int cardType = i / 4;
			int cardColour = i % 4;

			switch (cardType) {
			case 0:
				System.out.print("2");
				break;
			case 1:
				System.out.print("3");
				break;
			case 2:
				System.out.print("4");
				break;
			case 3:
				System.out.print("5");
				break;
			case 4:
				System.out.print("6");
				break;
			case 5:
				System.out.print("7");
				break;
			case 6:
				System.out.print("8");
				break;
			case 7:
				System.out.print("9");
				break;
			case 8:
				System.out.print("10");
				break;
			case 9:
				System.out.print("J");
				break;
			case 10:
				System.out.print("Q");
				break;
			case 11:
				System.out.print("K");
				break;
			case 12:
				System.out.print("A");
				break;
			}

			switch (cardColour) {

			case 0:
				System.out.print(" spatia");
				break;
			case 1:
				System.out.print(" karo");
				break;
			case 2:
				System.out.print(" kupa");
				break;
			case 3:
				System.out.print(" pika");
				break;
			}
			if (i < 51) {
				System.out.println(",");
			}

		}
		sc.close();

	}

}

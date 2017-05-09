import java.util.Scanner;


public class PicckingGoodAce {

	public static void main(String[] args) {
		// Picking good Ace, 2 option Milen
		// read string, combination of two of
		// A,T,J,K,Q,2,3,4,5,6,7,8,9, comma separated
		// write a program to count tries until you get
		// 5 consecutive Big Ace "A && A || T|| J|| K|| Q

		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int counterTries = 0;
		while (true) {
			System.out.println("Enter two cards separated by space:");
			String cards = sc.nextLine();
			while ((cards.charAt(0) > '9' || cards.charAt(0) < '2')
					&& (cards.charAt(0) != 'A' && cards.charAt(0) != 'T' && cards.charAt(0) != 'J'
							&& cards.charAt(0) != 'K' && cards.charAt(0) != 'Q')
					|| cards.charAt(1) != ' ' || ((cards.charAt(2) > '9') || cards.charAt(0) < '2')
					&& (cards.charAt(2) != 'A' && cards.charAt(0) != 'T' && cards.charAt(2) != 'J'
							&& cards.charAt(0) != 'K' && cards.charAt(2) != 'Q')) {
				System.out.println("Enter two real cards separated by space:");
				cards = sc.nextLine();

			}
			
			if (cards.charAt(0) == 'A' && (cards.charAt(2) == 'A' || cards.charAt(2) == 'T' 
					|| cards.charAt(2) == 'J' && cards.charAt(2) == 'K' || cards.charAt(2) == 'Q')
					|| (cards.charAt(2) == 'A' && (cards.charAt(0) == 'A' || cards.charAt(0) == 'A' 
					|| cards.charAt(0) == 'T')|| cards.charAt(0) == 'J' || cards.charAt(0) == 'K'
					|| cards.charAt(0) == 'Q')){
				counter++;
			}
			counterTries++;
			if(counter < 5){
				counter = 0;
			}else if(counter == 5){
				System.out.println(counterTries);
				break;
			}

		}
		sc.close();

	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersInStringConvertion {

	public static void main(String[] args) {
		// I guess far from the best solution
		
		String a = "Kdsk5h8zdcknl96;lk23sdm";
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < a.length(); i++){
			char c = a.charAt(i);
			if(c >= 48 && c < 58){
				str.append(c);
			}
			if(!(c >= 48 && c < 58) && i != 0 && a.charAt(i - 1) >= 48 && a.charAt(i - 1) < 58){
				str.append("\n");
			}
		}
		ArrayList<Integer> x = new ArrayList<>();
		int number = 0;
		int mult = 1;
		String again = new String(str);
		Scanner sc = new Scanner(again);
	
		while(sc.hasNextLine()){
			String next = sc.nextLine();
			for(int i = next.length() - 1; i >= 0; i--){
				number += ((int)next.charAt(i) - 48) * mult;
				mult *= 10;
			}
			x.add(number);
			number = 0;
			mult = 1;
		}
	
		for(Integer s: x){
			System.out.print(s + " ");
		}

		
		
		

	}

}

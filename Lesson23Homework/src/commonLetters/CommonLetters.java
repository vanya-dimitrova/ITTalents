package commonLetters;


import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CommonLetters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text: ");
		String text = sc.nextLine();
		while(text.isEmpty()){
			System.out.println("Enter some text: ");
			text = sc.nextLine();
		}
		sc.close();
		text = text.toUpperCase();

		TreeMap<Letter, ArrayList<Character>> commonLetters = new TreeMap<>();
		
		getCommonLetters(text, commonLetters);
		TreeMap<Letter, ArrayList<Character>> sortedCommonLetters = getSortedCommonLetters(commonLetters);
		printCommonLetters(sortedCommonLetters);
		
	
	}
	
	
	static void getCommonLetters(String str, TreeMap tmap){
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' && str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				Letter nextLetter = new Letter(str.charAt(i));
				if (tmap.containsKey(nextLetter)) {
					for (Iterator<Letter> it = tmap.keySet().iterator(); it.hasNext();) {
						Letter letter = it.next();
						if (letter.getSign().equals(nextLetter.getSign())) {
							letter.increaseRepetition();
						}
					}
				} else {
					tmap.put(nextLetter, nextLetter.statistics);
				}
			}
		}
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
	}
	
	static TreeMap getSortedCommonLetters(TreeMap tmap){
		TreeMap<Letter, ArrayList<Character>> sortedCommonLetters = new TreeMap<>(new ComparatorByRepetition());
		for(Iterator<Entry<Letter, ArrayList<Character>>> it = tmap.entrySet().iterator(); it.hasNext();){
			Entry<Letter, ArrayList<Character>> e = it.next();
			sortedCommonLetters.put(e.getKey(), e.getValue());
		}
		return sortedCommonLetters;	
	}
	
	
	static void printCommonLetters(TreeMap tmap){
		for (Iterator<Entry<Letter, ArrayList<Character>>> it = tmap.entrySet().iterator(); it.hasNext();) {
			Entry<Letter, ArrayList<Character>> e = it.next();
			System.out.print(e.getKey().toString() + " ");
			e.getKey().printStatistics();
			System.out.println();
		}
	}

}

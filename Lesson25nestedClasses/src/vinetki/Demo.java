package vinetki;

import java.util.Random;

import vinetki.Vinetka.VinetkaSrok;
import vinetki.Vinetka.VinetkaType;

public class Demo {
	
	public static void main(String[] args) {
		
		GasStation shell = new GasStation();
		
		//String[] tipove = {"Avtobus", "Kola", "Kamion"};
		//String[] srokove = {"Dnevna", "Mesechna", "Godishna"};
		//String randomT = tipove[new Random().nextInt(tipove.length)];
		
		for (int i = 0; i < 10000; i++) {
			
			VinetkaType randType = VinetkaType.values()[new Random().nextInt(VinetkaType.values().length)];
			VinetkaSrok randSrok = VinetkaSrok.values()[new Random().nextInt(VinetkaSrok.values().length)];
			shell.addVinetka(new Vinetka(randType, randSrok));
		}

		shell.sellVinetka(VinetkaType.KAMION, VinetkaSrok.MESECHNA);
		
		Vinetka v = new Vinetka(VinetkaType.AVTOBUS, VinetkaSrok.GODISHNA);
		System.out.println(v.getPrice());
	}

}

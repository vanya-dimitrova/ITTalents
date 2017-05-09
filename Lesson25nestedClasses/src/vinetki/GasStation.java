package vinetki;

import java.util.ArrayList;
import java.util.HashMap;

import vinetki.Vinetka.VinetkaSrok;
import vinetki.Vinetka.VinetkaType;

public class GasStation {

	 ArrayList<Vinetka> vinetkiteNaVania;
	private HashMap<VinetkaType, HashMap<VinetkaSrok, ArrayList<Vinetka>>> kartoteka;
	
	public GasStation() {
		vinetkiteNaVania = new ArrayList<>();
		kartoteka = new HashMap<>();
	}
	
	public void addVinetka(Vinetka v){
		vinetkiteNaVania.add(v);
		
		VinetkaType type = v.getType();
		VinetkaSrok srok = v.getSrok();
		if(!kartoteka.containsKey(type)){
			kartoteka.put(type, new HashMap<>());
		}
		if(!kartoteka.get(type).containsKey(srok)){
			kartoteka.get(type).put(srok, new ArrayList<>());
		}
		kartoteka.get(type).get(srok).add(v);
	}

	public void sellVinetka(VinetkaType type, VinetkaSrok srok) {
		ArrayList<Vinetka> vinetki = kartoteka.get(type).get(srok);
		vinetki.remove(vinetki.size()-1);
	}
}

package musicShop;


import java.util.Random;
import musicShop.MusicShop.MusicalInstrument.Name;
import musicShop.MusicShop.Supplier;

public class Demo {
	
	public static void main(String[] args) {
		
		Supplier kontrabanda = new Supplier();

		for (int i = 0; i < 50; i++) {
			Name randomName = Name.values()[new Random().nextInt(Name.values().length)];
			kontrabanda.addMusicalInstruments(randomName, new Random().nextInt(10) + 1);
		}
		
		MusicShop veselba = new MusicShop(kontrabanda);
		for (int i = 0; i < 20; i++) {
			Name randomName = Name.values()[new Random().nextInt(Name.values().length)];
			veselba.addMusicalInstruments(randomName, new Random().nextInt(5) + 1);
		}
		
		veselba.viewCatalogByType();
		
		veselba.acceptOrder(Name.GUITAR, 4);
		System.out.println();
		
		veselba.viewCatalogByName();
		System.out.println();
		veselba.viewCatalogByPrice();
		System.out.println();
		veselba.viewAvailableToByu();
		System.out.println();
		//veselba.viewStatisticsSoldByQuantity();

		
		
		
	
	

	
	}
}

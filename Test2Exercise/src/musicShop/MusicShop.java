package musicShop;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;



import musicShop.MusicShop.MusicalInstrument.Name;

public class MusicShop {

	static class MusicalInstrument {

		 enum Name {
			VIOLIN(200, "STRING"), VIOLA(100, "STRING"), CONTRABASS(300, "STRING"), HARP(400, "STRING"), GUITAR(350,
					"STRING"), FIDDLE(450, "STRING"), DRUMS(280, "PERCUSSIONS"), TARAMBUKA(180,
							"PERCUSSIONS"), DRUM(460, "PERCUSSIONS"), TAMBOURINE(270, "PERCUSSIONS"), TRUMPET(330,
									"BRASS"), TROMBONE(230, "BRASS"), TUBA(150, "BRASS"), FLUTE(210, "BRASS"), CLARINET(
											290, "BRASS"), ORGAN(370, "KEYBOARD"), PIANO(520, "KEYBOARD"), ACORDION(440,
													"KEYBOARD"), SYNTHESIZER(530, "ELECTRONICS"), BASSGUITAR(650,
															"ELECTRONICS"), ELECTRICVIOLIN(240, "ElECTRONICS");

			private int price;
			private String type;

			Name(int price, String type) {
				this.price = price;
				this.type = type;
			}
		}

		private Name name;
		private String type;
		private int price;
		int quantity;

		MusicalInstrument(Name name) {
			this.name = name;
			this.type = this.name.type;
			this.price = this.name.price;
			this.quantity = 1;
		}

		@Override
		public int hashCode() {
			return this.name.price;
		}

		@Override
		public boolean equals(Object obj) {
			return this.equals(obj);
		}

	}

	static class Supplier {

		private HashMap<Name, MusicalInstrument> forSale;

		Supplier() {
			forSale = new HashMap<>();
		}

		void addMusicalInstruments(Name instrumentName, int quantity) {
			if (!this.forSale.containsKey(instrumentName)) {
				this.forSale.put(instrumentName, new MusicalInstrument(instrumentName));
			} else {
				this.forSale.get(instrumentName).quantity += quantity;
			}
		}

		private int deliveryInfo(Name instrumentName, int quantity) {
			if (this.forSale.containsKey(instrumentName)) {
				return new Random().nextInt(5);
			} else {
				return 0;
			}
		}
	}

	private TreeMap<Name, MusicalInstrument> catalog;
	private TreeMap<Name, MusicalInstrument> sold;
	private Supplier supplier;
	private int cashier;

	MusicShop(Supplier supplier) {
		this.catalog = new TreeMap<>();
		this.sold = new TreeMap<>();
		this.supplier = supplier;
		this.cashier = 0;
	}

	void addMusicalInstruments(Name instrumentName, int quantity) {
		if (!this.catalog.containsKey(instrumentName)) {
			this.catalog.put(instrumentName, new MusicalInstrument(instrumentName));
			this.catalog.get(instrumentName).quantity += quantity;
		} else {
			this.catalog.get(instrumentName).quantity += quantity;
		}
	}

	void acceptOrder(Name instrumentName, int quantity) {
		if (this.catalog.containsKey(instrumentName) && this.catalog.get(instrumentName).quantity - quantity >= 0) {
			System.out.println("Congratulations, you bought yourself new " + instrumentName + "(S)!" + "\n");
			this.catalog.get(instrumentName).quantity -= quantity;
			this.cashier += instrumentName.price;
			if (!this.sold.containsKey(instrumentName)) {
				this.sold.put(instrumentName, new MusicalInstrument(instrumentName));
			} else {
				this.sold.get(instrumentName).quantity += quantity;
			}
		} else {
			int deliveryTime = this.supplier.deliveryInfo(instrumentName, quantity);
			System.out.println("Not enough quantity available!");
			System.out.println(deliveryTime == 0 ? "Sorry! No delivery option for this product at the moment!"
					: "Delivery time expected upon order (" + deliveryTime + ") day(s)!");
		}
	}

	void viewCatalogByType() {
		for (Iterator<Map.Entry<Name, MusicalInstrument>> it = this.catalog.entrySet().iterator(); it.hasNext();) {
			Map.Entry<Name, MusicalInstrument> e = it.next();
			System.out.println(e.getValue().type + ":  " + e.getKey() + " (" + e.getValue().quantity + ")" + "- "
					+ e.getValue().price + "lv/piece");
		}
	}

	void viewCatalogByName() {
		TreeMap<Name, MusicalInstrument> catalogByName = new TreeMap<>((o1, o2) -> o1.name().compareTo(o2.name()));
		catalogByName.putAll(this.catalog);
		for (Iterator<Map.Entry<Name, MusicalInstrument>> it = catalogByName.entrySet().iterator(); it.hasNext();) {
			Map.Entry<Name, MusicalInstrument> e = it.next();
			System.out.println(e.getKey() + "  (" + e.getValue().type + ") (" + e.getValue().quantity + ")" + "- "
					+ e.getValue().price + "lv/piece");
		}
	}

	void viewCatalogByPrice() {
		TreeMap<Name, MusicalInstrument> catalogByPrice = new TreeMap<>((o1, o2) -> o1.price - o2.price);
		catalogByPrice.putAll(this.catalog);
		for (Iterator<Map.Entry<Name, MusicalInstrument>> it = catalogByPrice.entrySet().iterator(); it.hasNext();) {
			Map.Entry<Name, MusicalInstrument> e = it.next();
			System.out.println(e.getValue().price + "- lv/piece: " + e.getKey() + "  (" + e.getValue().type + ") ("
					+ e.getValue().quantity + ")");
		}
	}

	void viewAvailableToByu() {
		for (Iterator<Map.Entry<Name, MusicalInstrument>> it = this.catalog.entrySet().iterator(); it.hasNext();) {
			Map.Entry<Name, MusicalInstrument> e = it.next();
			if (e.getValue().quantity > 0) {
				System.out.println(e.getValue().type + ":  " + e.getKey() + " (" + e.getValue().quantity + ")" + "- "
						+ e.getValue().price + "lv/piece");
			}
		}
	}

	//void viewStatisticsSoldByQuantity(){
	//TreeMap<Name, MusicalInstrument> soldByQuantity = new TreeMap<>(new ComparatorByValue());
	// Map is sorted only by key. only by key
		// to sort by value.quantity I need to put them in a new treeMap with reversed key and value
		// and then put them back with reversed key and value again
	
	//}
	
	
}
	
	
	






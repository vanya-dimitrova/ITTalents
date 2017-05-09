package vinetki;

public class Vinetka {

	enum VinetkaType { 
		AVTOBUS(9), KOLA(5), KAMION(7);
		
		int price;
	
		
		private VinetkaType(int price) {
			this.price = price;
		}
		
		
	}
	enum VinetkaSrok { 
		DNEVNA(1), MESECHNA(10), GODISHNA(60);
		
		int mnojitel;
		
		private VinetkaSrok(int mnojitel) {
			this.mnojitel = mnojitel;
		}
		
		
	}
	
	private VinetkaType type;
	private VinetkaSrok srok;
	private double price;
	
	public Vinetka(VinetkaType type, VinetkaSrok srok) {
		this.type = type;
		this.srok = srok;
		this.price = calcPrice();
	}
	
	private double calcPrice() {
		return this.type.price*this.srok.mnojitel;
	}

	public VinetkaType getType() {
		return type;
	}
	
	public VinetkaSrok getSrok() {
		return srok;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return type + " : " + srok;
	}
}


public class Task10TwoBuckets {

	public static void main(String[] args) {
		
		int obemCisterna = 318;
		int extraKofa = obemCisterna%5;
		int kofiZaedno = obemCisterna - extraKofa;
		int nalivane = kofiZaedno/5;
		System.out.println("Za da se napulni cisterna s obem 358 litra e neobhodimo da se naleiat:");
		System.out.println(nalivane+" kofi s obem 2 litra ");
		System.out.println(nalivane+" kofi s obem 3 litra ");
		if (extraKofa != 0){
		System.out.println("1 dopulnitelna kofa ot "+extraKofa+" litra");
		}

	}

}

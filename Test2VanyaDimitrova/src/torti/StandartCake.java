package torti;

import java.util.Random;


public class StandartCake extends Cake implements Comparable<StandartCake>{
	
	enum CakeType { BISQUIT, EQLER, FRUIT, CHOCOLATE }
	
	private CakeType type;
	private boolean isSyrupised;
	CakeType typo = CakeType.values()[new Random().nextInt(CakeType.values().length)];
	
	public StandartCake(String name, String description, int price, int pieces) {
		super(name, description, price, pieces, CakeSort.STANDART);
		this.isSyrupised = new Random().nextBoolean();
		this.type = typo;
	}

	@Override
	public int compareTo(StandartCake o) {
		return o.price - this.price;
	}

	public CakeType getType() {
		return type;
	}
	
	
	
}


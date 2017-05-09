package torti;

import java.util.Random;

public class WeddingCake extends Cake implements Comparable<WeddingCake>{

	enum CakeType {
		BIG, SMALL, MIDDLE
	}

	private CakeType type;
	private int layers;
	CakeType typo = CakeType.values()[new Random().nextInt(CakeType.values().length)];

	public WeddingCake(String name, String description, int price, int pieces) {
		super(name, description, price, pieces, CakeSort.WEDDING);
		if (layers > 0) {
			this.layers = new Random().nextInt(5);
		}
		this.type = typo;
	}

	public CakeType getType() {
		return type;
	}

	@Override
	public int compareTo(WeddingCake o) {
		return this.pieces = o.pieces;
	}

}

package torti;

import java.util.Random;


public class SpecialCake extends Cake implements Comparable<SpecialCake> {

	enum CakeType {
		ANNIVERSARY, CORPORATE, MARKETING
	}

	private CakeType type;
	private String event;
	CakeType typo = CakeType.values()[new Random().nextInt(CakeType.values().length)];

	public SpecialCake(String name, String description, int price, int pieces, String event) {
		super(name, description, price, pieces, CakeSort.SPECIAL);
		if (event != null && !event.isEmpty()) {
			this.event = event;
		}
		this.type = typo;
	}


	public CakeType getType() {
		return type;
	}


	@Override
	public int compareTo(SpecialCake o) {
		return o.price - this.price;
	}


	


}

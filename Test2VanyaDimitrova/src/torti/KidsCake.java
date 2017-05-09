package torti;

import java.util.Random;


public class KidsCake extends Cake implements Comparable<KidsCake>{

	enum CakeType {
		BIRTHDAY, CHRISTENING, FIRSTSTEPS
	}

	private CakeType type;
	private String kidName;
	
	CakeType typo = CakeType.values()[new Random().nextInt(CakeType.values().length)];

	public KidsCake(String name, String description, int price, int pieces, String kidname) {
		super(name, description, price, pieces, CakeSort.KIDS);
		if (kidName != null && !kidName.isEmpty()) {
			this.kidName = kidName;
		}
		this.type = typo;
	}
	
	public CakeType getType() {
		return type;
	}

	@Override
	public int compareTo(KidsCake o) {
		return this.pieces - o.pieces;
	}


}

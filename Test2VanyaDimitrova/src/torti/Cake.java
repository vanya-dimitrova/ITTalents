package torti;


public class Cake {

	enum CakeSort {
		STANDART, WEDDING, SPECIAL, KIDS
	}

	String name;
	String description;
	int price;
	int pieces;
	CakeSort sort;

	public Cake(String name, String description, int price, int pieces, CakeSort sort) {
		if (name != null && !name.isEmpty() && description != null && !description.isEmpty() && price > 0
				&& pieces > 0) {
			this.name = name;
			this.description = description;
			this.price = price;
			this.pieces = pieces;
			this.sort = sort;
		}

	}

	public int getPrice() {
		return price;
	}

	public CakeSort getSort() {
		return sort;
	}
	
	@Override
	public int hashCode() {
		return this.description.length() * 31;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cake){
			Cake other = (Cake) obj;
			return this.equals(other);
		}
		return false;
		
	}

}

package ovci;

public class Ovca {

	private String name;

	public Ovca(String name) {
		this.name = name;
	}
	
	public boolean ravnaNa(Ovca other){
		return this.name.equals(other.name);
	}
	
}

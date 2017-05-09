package immigrants;

import immigrants.Immigrant.City;
import immigrants.Immigrant.Country;

public class Policeofficer {

	public static class SpecialPoliceofficer extends Policeofficer {

		int checkImmigrant(Immigrant immigrant) {
			// TODO
			return 0;
		}

	}
	
    private static int hashCode = 0;
	private String name;
	private City city;
	private Country country;
	
	
	void setCity(City city){
		this.city = city;
		this.city.setPoliceofficers(this);
	}

	int checkImmigrant(Immigrant immigrant) {
		// TODO
		return 0;
	}

	@Override
	public int hashCode() {
		return hashCode++;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

}

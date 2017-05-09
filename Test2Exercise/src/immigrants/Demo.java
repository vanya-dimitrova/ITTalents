package immigrants;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import immigrants.Immigrant.City;
import immigrants.Immigrant.Country;
import immigrants.Policeofficer.SpecialPoliceofficer;

public class Demo {

	public static void main(String[] args) {
		
		// 1.

		Country someCountry = new Country("Some Country");
		someCountry.cities.add(new City("Some city1", someCountry, new Random().nextInt(500000) + 10000));
		someCountry.cities.add(new City("Some city2", someCountry, new Random().nextInt(500000) + 10000));
		someCountry.cities.add(new City("Some city3", someCountry, new Random().nextInt(500000) + 10000));
		someCountry.cities.add(new City("Some city4", someCountry, new Random().nextInt(500000) + 10000));
		someCountry.cities.add(new City("Some city5", someCountry, new Random().nextInt(500000) + 10000));

		HashSet<Policeofficer> policeofficersRandom = new HashSet<>();

		for (int i = 0; i < 20; i++) {
			int random = new Random().nextInt(2);
			switch (random) {
			case 0:
				policeofficersRandom.add(new Policeofficer());
				break;
			case 1:
				policeofficersRandom.add(new SpecialPoliceofficer());
				break;
			}
		}
		
		for(Iterator<Policeofficer> it1 = policeofficersRandom.iterator(); it1.hasNext();){
		Policeofficer officer = it1.next();
		Iterator<City> it = someCountry.cities.iterator();
			while(it.hasNext()){
				City city= it.next();	
				city.setPoliceofficers(officer);
			}
			
		}
		
		
		

	}
}

package immigrants;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public abstract class Immigrant {

	static class Passport {

		private String name;
		private int years;
		private String city;
		private String country;

		public Passport(String name, int years, String city, String country) {
			if (name != null && !name.isEmpty() && years > 0 && city != null && country != null) {
				this.name = name;
				this.years = years;
				this.city = city;
				this.country = country;
			}
		}

	}

	private static class Weapon {

		enum WeaponType {
			GUN(300), BOMB(400), AUTOMAT(200);
			private int price;

			WeaponType(int price) {
				this.price = price;
			}
		}

		WeaponType type;
		private int price;

		public Weapon() {
			int randomType = new Random().nextInt(WeaponType.values().length);
			this.type = WeaponType.values()[randomType];
			this.price = this.type.price;
		}

		private int start() {
			if (this.type == WeaponType.GUN) {
				return 8;
			} else if (this.type == WeaponType.BOMB) {
				return 0;
			}
			return 30;
		}

	}

	static class City {

		private String name;
		private Country country;
		private HashSet<Policeofficer> policeofficers;
		private int citizens;
		private HashSet<Immigrant> immigrants;
		private HashSet<Immigrant> immigrantsExploded;

		public City(String name, Country country, int citizens) {
			if (name != null && !name.isEmpty() && country != null && country != null) {
				this.name = name;
				this.country = country;
				this.citizens = citizens;
				this.policeofficers = new HashSet<>();
				this.immigrants = new HashSet<>();
				this.immigrantsExploded = new HashSet<>();
			}
		}
		
		void setPoliceofficers(Policeofficer officer){
			this.policeofficers.add(officer);
		}
		
		@Override
		public int hashCode() {
			int count = 0;
			for(int i = 0; i < this.name.length(); i++){
				count+=this.name.charAt(i);
			}
			return count;
		}
		
		@Override
		public boolean equals(Object obj) {
			City other = (City) obj;
			if(!this.name.equals(other.name)){
				return false;
			}
			else if(!this.country.equals(other.country)){
				return false;
			}
			return true;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

	}

	static class Country {

		private String name;
		HashSet<City> cities;

		public Country(String name) {
			if (name != null && !name.isEmpty()) {
				this.name = name;
			} else {
				this.name = "Country";
			}
			cities = new HashSet<>();
		}
	

	}

	interface UnusualImmigrant {
		
		void useWeapon();

	}

	static class UsualImmigrant extends Immigrant {

		public UsualImmigrant(String name, int years, int money, boolean hasPassport, City city, String country) {
			super(name, years, money, hasPassport, city, country);
		}

		@Override
		void buyWeapon(Weapon weapon) {
			// TODO Auto-generated method stub
			
		}

	}

	static class RadicalImmigrant extends Immigrant implements UnusualImmigrant {

		ArrayList<Weapon> weapons;

		public RadicalImmigrant(String name, int years, int money, boolean hasPassport, City city, String country) {
			super(name, years, money, hasPassport, city, country);
			this.weapons = new ArrayList<>();
		}

		@Override
		public void useWeapon() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void buyWeapon(Weapon weapon) {
			// TODO Auto-generated method stub
			
		}

	}
	
	
	static class ExtremistImmigrant extends Immigrant implements UnusualImmigrant {

		ArrayList<Weapon> weapons;

		public ExtremistImmigrant(String name, int years, int money, boolean hasPassport, City city, String country) {
			super(name, years, money, hasPassport, city, country);
			this.weapons = new ArrayList<>();
		}

		@Override
		public void useWeapon() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void buyWeapon(Weapon weapon) {
			// TODO Auto-generated method stub
			
		}

	}

	private Passport passport;
	private boolean hasPassport;
	private int money;
	private City city;
	private String country;
	private HashSet<Immigrant> relatives;

	public Immigrant(String name, int years, int money, boolean hasPassport, City city, String country) {
		this.passport = new Passport(name, years, city.name, city.country.name);
		this.hasPassport = hasPassport;
		this.money = money;
		this.city = city;
		this.country = country;
		this.relatives = new HashSet<>();
	}

	private void immigrate() {
		// TODO
	}

	abstract void buyWeapon(Weapon weapon);
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}

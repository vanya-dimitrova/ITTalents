package person;

public class Person {
	
	private String name;
	private int age;
	private boolean isMale;
		
	// if subclass Student needs a constructor with no parameters
	// we need a constructor with no parameters in the super class as well
	
	// Person(){
	// ...optional code
	// }
	
	Person(String name, int age, boolean isMale){
		if(name != null){
			this.name = name;
		}
		if(age > 0){
			this.age = age;
		}
		this.isMale = isMale;
	}

	final String getName() {
		return name;
	}

	final int getAge() {
		return age;
	}

	final boolean isMale() {
		return isMale;
	}

	@Override
	public String toString() {
		String info = "Name: "+this.name+"\n"+"Age: "+this.age+"\n"+"Male: "+this.isMale;
		return info;
	}
	
	
	

}


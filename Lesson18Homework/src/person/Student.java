package person;

public class Student extends Person {
	
	private double score;
	
	Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		if(score > 2.0 && score <= 6){
		   this.score = score;
		}
	}

	final double getScore() {
		return score;
	}

	@Override
	public String toString() {
		String info = "Occupation: "+this.getClass().getSimpleName()+"\n"+super.toString()+"\n"+"Score: "+this.score;
		return info;
	}

	
	
	
	
	
	
	

}

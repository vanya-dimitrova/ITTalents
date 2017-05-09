package person;

public class Employee extends Person {
	
	private int daySalary;
	
	Employee(String name, int age, boolean isMale, int daySalary){
		super(name, age, isMale);
		if(daySalary > 0){
			this.daySalary = daySalary;
		}
	}

	final int getDaySalary() {
		return daySalary;
	}
	
	double calculateOverTime(double hours){
		if(this.getAge() > 17 && hours > 8){
			return (hours - 8)*(this.daySalary/8)*1.5;
		}
		else{
			return 0;
		}
	}

	@Override
	public String toString() {
		String info = "Occupation: "+this.getClass().getSimpleName()+"\n"+super.toString()+"\n"+"Day Salary: "+this.daySalary;
		return info;
	}



}

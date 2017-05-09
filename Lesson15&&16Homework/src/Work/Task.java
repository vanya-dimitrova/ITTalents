package Work;

public class Task {
	
	private String name;
	private double workingHours;
	
	Task(String name, double workingHours){
		if(name != null){
	    	this.name = name;
		}
		this.setWorkingHours(workingHours);
	}
	
	
	String getName(){
		return this.name;
	}
	
	void setWorkingHours(double workingHours){
		if(workingHours >= 0){
		   this.workingHours = workingHours;
		}
	}
	
	
	double getWorkingHours(){
		return this.workingHours;
	}
	
	

}

package atWork;

public class Task {
	private String name;
	private int workingHours;
	
	Task(String name, int workingHours){
		if(name != null){
	    	this.name = name;
		}
		this.setWorkingHours(workingHours);
	}
	
	
	String getName(){
		return this.name;
	}
	
	
	int getWorkingHours(){
		return this.workingHours;
	}
	
	void setWorkingHours(int workingHours){
		if(workingHours >= 0){
		   this.workingHours = workingHours;
		}
	}
	
	
	
	

}

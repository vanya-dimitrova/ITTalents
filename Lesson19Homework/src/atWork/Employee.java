package atWork;

public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	private AllWork allWork;

	Employee(String name) {
		if (name != null) {
			this.name = name;
		}
		this.setHoursLeft(8);
	}


	void work() {
		if(this.hoursLeft > 0 && !this.allWork.isAllWorkDone()){
			if(this.currentTask == null){
				this.setCurrentTask(this.allWork.getNextTask());
				System.out.println(this.name + " has started " + this.currentTask.getName() + ".");
			}else if(this.currentTask.getWorkingHours() == 0){
				System.out.println(this.name + " has finished " + this.currentTask.getName() + ".");
				this.setCurrentTask(this.allWork.getNextTask());
				System.out.println(this.name + " has started " + this.currentTask.getName() + ".");
			}else{
				System.out.println(this.name + " is still busy with " + this.currentTask.getName() + ".");
			}
			if (this.hoursLeft > this.currentTask.getWorkingHours()) {
				this.hoursLeft -= this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
			} else if(this.hoursLeft < this.currentTask.getWorkingHours()){
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.setHoursLeft(0);
				System.out.println("Task will be completed on the next working day.");
			}
		}
		else if(this.allWork.isAllWorkDone()){
			System.out.println(this.name + " has finished " + this.currentTask.getName() + ".");
		}
		System.out.println();
	}


	void startWorkingDay() {
		this.setHoursLeft(8);
	}

	private String getName() {
		return this.name;
	}

	private Task getCurrentTask() {
		return currentTask;
	}

	private void setCurrentTask(Task a) {
		if (a != null) {
			this.currentTask = a;
		}
	}

	int getHoursLeft() {
		return this.hoursLeft;
	}

	private void setHoursLeft(int a) {
		if (a >= 0) {
			this.hoursLeft = a;
		}
	}

	private AllWork getAllWork() {
		return this.allWork;
	}

	void setAllWork(AllWork a) {
		this.allWork = a;
	}

}

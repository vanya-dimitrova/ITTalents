package Work;

public class Employee {

	private String name;
	Task currentTask;
	private double hoursLeft;

	Employee(String name) {
		if (name != null) {
			this.name = name;
		}
		this.hoursLeft = 8;
	}

	String getName() {
		return this.name;
	}

	double getHoursLeft() {
		return this.hoursLeft;
	}

	void work(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
			if (this.hoursLeft > this.currentTask.getWorkingHours()) {
				this.hoursLeft -= currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
			} else if (this.hoursLeft < this.currentTask.getWorkingHours()) {
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.hoursLeft = 0;
			}
		}
	}

	void showReport() {
		System.out.println("Employee: " + this.name);
		System.out.println("Employee working hours left: " + this.hoursLeft);
		if (this.currentTask != null) {
			System.out.println("Task handled: " + this.currentTask.getName());
			System.out.println("Task hours to finish: "+ this.currentTask.getWorkingHours() + " hours");
		}
	}

}

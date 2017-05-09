package atWork;

public class AllWork {

	private int freePlacesForTasks;
	private Task[] tasks;
	private int currentUnassignedTask;

	AllWork() {
		this.freePlacesForTasks = 10;
		this.tasks = new Task[this.freePlacesForTasks];
		this.currentUnassignedTask = 0;
	}

	void addTask(Task a) {
		if (this.freePlacesForTasks > 0) {
			this.tasks[this.currentUnassignedTask++] = a;
			this.freePlacesForTasks--;
		} else {
			System.out.println("No availability for new tasks!");
		}
	}

	Task getNextTask() {
		return tasks[--this.currentUnassignedTask];
	}

	int getCurrentUnassignedTask() {
		return this.currentUnassignedTask;
	}

	boolean isAllWorkDone() {
		if (this.currentUnassignedTask == 0) {
			return true;
		} else {
			return false;
		}
	}

}

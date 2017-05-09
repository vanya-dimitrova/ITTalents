package atWork;

public class Office {

	public static void main(String[] args) {

		AllWork office = new AllWork();
		office.addTask(new Task("cleaning", 2));
		office.addTask(new Task("dealing with paperwork", 2));
		office.addTask(new Task("answering phone calls", 6));
		office.addTask(new Task("organising documentation", 3));
		office.addTask(new Task("working on a project", 12));
		office.addTask(new Task("attending a meeting", 4));
		office.addTask(new Task("performing custom&service", 3));
		office.addTask(new Task("preparing an offer", 4));
		office.addTask(new Task("responding to emails", 5));
		office.addTask(new Task("performing a presentation", 4));

		Employee ivanov = new Employee("Ivan Ivanov");
		ivanov.setAllWork(office);
		Employee georgiev = new Employee("Georgi Georgiev");
		georgiev.setAllWork(office);
		Employee vasileva = new Employee("Vasilka Vasileva");
		vasileva.setAllWork(office);

		int counter = 1;
		while (true) {
			if (office.isAllWorkDone()) {
				break;
			}

			switch (counter) {
			case 1:
				System.out.println("Monday:"+"\n");
				counter++;
				break;
			case 2:
				System.out.println("Tuesday:"+"\n");
				counter++;
				break;
			case 3:
				System.out.println("Wednesday:"+"\n");
				counter++;
				break;
			case 4:
				System.out.println("Thursday:"+"\n");
				counter++;
				break;
			case 5:
				System.out.println("Friday:"+"\n");
				counter++;
				break;
			}
			if (counter == 6) {
				counter = 1;
			}
			ivanov.startWorkingDay();
			georgiev.startWorkingDay();
			vasileva.startWorkingDay();
			while (ivanov.getHoursLeft() > 0 || georgiev.getHoursLeft() > 0 || vasileva.getHoursLeft() > 0) {
				ivanov.work();
				georgiev.work();
				vasileva.work();
				if (office.isAllWorkDone()) {
					System.out.println("\n"+"Tasks complition summarise:"+"\n");
					ivanov.work();
					georgiev.work();
					vasileva.work();
					System.out.println("All tasks have been done at the office.");
					break;
				}
			
			}

		}

	}

}

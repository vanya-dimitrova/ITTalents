package person;

public class Demo {

	public static void main(String[] args) {

		Person elena = new Person("Elena", 13, false);
		Person mario = new Person("Mario", 15, true);

		Student ivan = new Student("Ivan", 23, true, 5);
		Student deni = new Student("Deni", 24, false, 4);

		Employee krum = new Employee("Krum", 29, true, 60);
		Employee katya = new Employee("Katya", 17, false, 40);
	

		Person[] data = {elena, mario, ivan, deni, krum, katya, null, null, null, null};

		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				System.out.println(data[i].toString());
			}
			if(data[i] instanceof Employee){
				Employee a = (Employee)data[i];
				System.out.println("Overtime: "+a.calculateOverTime(9.5));
			}
			System.out.println();
		}

	}

}

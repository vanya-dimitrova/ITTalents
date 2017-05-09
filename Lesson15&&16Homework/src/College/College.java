package College;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ivan = new Student("Ivan", "Geography", 29);
		Student ani = new Student("Ani", "Geography", 23);
		Student penko = new Student("Penko", "Geography", 21);
		Student tanya = new Student("Tanya", "Geography", 31);
		Student asen = new Student("Asen", "Iconomics", 25);

		StudentGroup geography = new StudentGroup("Geography");

		geography.addStudent(ivan);
		geography.addStudent(ani);
		geography.addStudent(penko);
		geography.addStudent(tanya);
		geography.addStudent(asen);

		System.out.print("1. ");
		geography.printStudentsInGroup();
		geography.theBestStudent();
		System.out.println("Places in group to fill up: "+geography.freePlaces);
		System.out.println();

		ivan.upYear();
		ivan.receiveScholarship(4, 200.00);
		
		System.out.print("2. ");
		geography.printStudentsInGroup();
		System.out.println("Places in group to fill up: "+geography.freePlaces);
		System.out.println();
		
		ivan.graduate(ivan);
		ani.upYear();
		penko.receiveScholarship(4, 200.00);
		tanya.grade = 5;
		tanya.receiveScholarship(5, 400.00);
		geography.emptyFromGraduated();

		System.out.print("3. ");
		geography.printStudentsInGroup();
		System.out.println("Places in group to fill up: "+geography.freePlaces);
		geography.theBestStudent();

	}


}

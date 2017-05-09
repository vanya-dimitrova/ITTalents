package College;

public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	int money;

	Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	void upYear() {
		if (this.isDegree == false) {
			this.yearInCollege++;
			this.age++;
			if (this.yearInCollege == 4) {
				this.isDegree = true;
			}
		}
	}
	
	double receiveScholarship(double min, double amount){
		if(this.grade >= min && this.age < 30 ){
			this.money+=amount;
		}
		return this.money;
	}
	
	Student graduate(Student s) {
		if (this.isDegree == false) {
			this.upYear();
			return graduate(s);
		} else{
			return s;
		}
	}
	

}

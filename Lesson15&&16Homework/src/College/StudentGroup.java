package College;


public class StudentGroup {

	String groupSubject;
	Student[] students;
	int freePlaces;
	

	StudentGroup() {
		this.students = new Student[4];
		this.freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student s) {
		if (s.subject.equals(this.groupSubject)) {
			for (int i = 0; i < students.length; i++) {
				if (this.students[i] == null) {
					this.students[i] = s;
					this.freePlaces--;
					return;
				}
				if (i == this.students.length) {
					System.out.println("There is no free place in this group.");

				}
			}
		}
	}

	void emptyGroup() {
		this.students = new Student[4];
		this.freePlaces = 5;
	}

	void theBestStudent() {
		Student theBestStudent = this.students[0];
		int theBestGrade = 2;
		System.out.print("Student(s) with highest grades in " + this.groupSubject + " group: ");
		for (int i = 1; i < students.length; i++) {
			if (this.students[i] != null && this.students[i].grade > theBestGrade) {
				theBestStudent = this.students[i];
			}
		}
		for (int j = 0; j < students.length; j++) {
			if (this.students[j] != null && theBestStudent.grade == students[j].grade) {
				System.out.print(students[j].name + "; ");
			}
		}
		System.out.println();
	}

	void printStudentsInGroup() {
		System.out.println("Details for students in " + this.groupSubject + " group:");
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println(students[i].name + ": age(" + students[i].age + "); school year("
						+ students[i].yearInCollege + "); grade(" + students[i].grade + "); scholarship("
						+ students[i].money + "); graduated(" + students[i].isDegree + ")");
			}
		}
		System.out.println();

	}
	
	void emptyFromGraduated() {
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i].isDegree == true) {
				this.students[i] = null;
				this.freePlaces++;
			}
		}
	}


}


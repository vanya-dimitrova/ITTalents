package hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;

public class Hospital {

	static class Doctor {

		private String name;
		private String sirName;
		private String telNumber;
		private String specialisation;
		HashSet<Patient> patients;

		public Doctor(String name, String sirName, String telNumber, String specialisation) {
			if (name != null && !name.isEmpty()) {
				this.name = name;
			}
			if (sirName != null && !sirName.isEmpty()) {
				this.sirName = sirName;
			}
			if (telNumber != null && !telNumber.isEmpty()) {
				this.telNumber = telNumber;
			}
			if (specialisation != null && !specialisation.isEmpty()) {
				this.specialisation = specialisation;
			}
			this.patients = new HashSet();
		}

		@Override
		public int hashCode() {
			return this.name.length() + this.sirName.length() + this.specialisation.length();
		}

		@Override
		public boolean equals(Object obj) {
			return this == obj;
		}

	}

	static class Nurse {

		private String name;
		private String sirName;
		private int yearsOld;
		private int practicePeriod;
		private String telNumber;

		public Nurse(String name, String sirName, int yearsOld, int practicePeriod, String telNumber) {
			if (name != null && !name.isEmpty()) {
				this.name = name;
			}
			if (sirName != null && !sirName.isEmpty()) {
				this.sirName = sirName;
			}
			if (yearsOld >= 21) {
				this.yearsOld = yearsOld;
			}
			if (practicePeriod > 0) {
				this.practicePeriod = practicePeriod;
			}
			if (telNumber != null && !telNumber.isEmpty()) {
				this.telNumber = telNumber;
			}
		}

		@Override
		public int hashCode() {
			return this.name.length() + this.sirName.length() + this.yearsOld + this.practicePeriod;
		}

		@Override
		public boolean equals(Object obj) {
			return this == obj;
		}

	}

	static class Patient {

		private boolean gender;
		private Carton carton;
		private Treatment treatment;

		public Patient(String gender) {
			if (gender == "male") {
				this.gender = true;
			} else {
				this.gender = false;
			}
		}

		@Override
		public int hashCode() {
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			return this == obj;
		}

	}

	static class Carton {

		private String name;
		private String sirName;
		private int yearsOld;
		private String telNumber;

		public Carton(String name, String sirName, int yearsOld, String telNumber) {
			if (name != null && !name.isEmpty()) {
				this.name = name;
			}
			if (sirName != null && !sirName.isEmpty()) {
				this.sirName = sirName;
			}
			if (yearsOld > 0) {
				this.yearsOld = yearsOld;
			}
			if (telNumber != null && !telNumber.isEmpty()) {
				this.telNumber = telNumber;
			}
		}
	}

	static class Treatment {

		private String diagnose;
		private ArrayList<String> medicines;
		private int treatmentPeriod;

		public Treatment(String diagnose, ArrayList<String> medicines, int treatmentPeriod) {
			this.diagnose = diagnose;
			this.medicines = medicines;
			this.treatmentPeriod = treatmentPeriod;
		}

	}

	private HashSet<Doctor> doctors;
	private HashSet<Nurse> nurses;
	private HashSet<Patient> patients;
	private TreeMap<String, ArrayList<ArrayList<Patient>>> departments;

	public Hospital() {
		this.doctors = new HashSet<>();
		this.nurses = new HashSet<>();
		this.patients = new HashSet<>();
		this.departments = new TreeMap<>();
		this.departments.put("Orthopedy", new ArrayList<>());
		this.departments.put("Cardiology", new ArrayList<>());
		this.departments.put("Virusology", new ArrayList());
	}

	void addNurse(Nurse nurse) {
		this.nurses.add(nurse);
	}

	void addDoctor(Doctor doctor) {
		this.doctors.add(doctor);
	}

	void checkPatientIn(Patient patient, String name, String sirName, int yearsOld, String telNumber) {
		patient.carton = new Carton(name, sirName, yearsOld, telNumber);
		for (Iterator<Doctor> it = this.doctors.iterator(); it.hasNext();) {
			Doctor doctor = it.next();

			if (doctor.patients.size() <= 2) {
				switch (new Random().nextInt(3)) {
				case 0:
					patient.treatment = new Treatment("Orthopedy", new ArrayList<>(), new Random().nextInt(5) + 1);
					patient.treatment.medicines.add("P");
					patient.treatment.medicines.add("V");
					patient.treatment.medicines.add("K");
					break;
				case 1:
					patient.treatment = new Treatment("Virusology", new ArrayList<>(), new Random().nextInt(5) + 1);
					patient.treatment.medicines.add("P");
					patient.treatment.medicines.add("V");
					patient.treatment.medicines.add("K");
					break;
				case 2:
					patient.treatment = new Treatment("Cardiology", new ArrayList<>(), new Random().nextInt(5) + 1);
					patient.treatment.medicines.add("P");
					patient.treatment.medicines.add("V");
					patient.treatment.medicines.add("K");
					break;
				}
			}
		}
		Doctor doctorToTreat = null;
		for (Iterator<Doctor> it = this.doctors.iterator(); it.hasNext();) {
			Doctor doctor = it.next();
			if (doctor.specialisation == patient.treatment.diagnose) {
				doctorToTreat = doctor;
				doctor.patients.add(patient);
			}
		}
		ArrayList<ArrayList<Patient>> department = this.departments.get(patient.treatment.diagnose);
		if (department.size() == 0) {
			department.add(new ArrayList<>());
			department.get(0).add(patient);
		} else if (department.size() < 10) {
			boolean patientIn = false;
			for (int i = 0; i < department.size(); i++) {
				if (department.get(i).size() < 3 && department.get(i).get(0).gender == patient.gender) {
					department.get(i).add(patient);
					patientIn = true;
				}
			}
			if (patientIn == false) {
				department.add(new ArrayList<Patient>());
				department.get(0).add(patient);
			}
		} else {
			System.out.println("There is no free beds in this department!");
		}
		System.out.println("Pacient " + patient.carton.name + " " + patient.carton.sirName + " s pol "
				+ (patient.gender ? "muj" : "jena") + " e priet(a) s diagnoza " + patient.treatment.diagnose
				+ ". Lekuvast lekar " + doctorToTreat.name + " " + doctorToTreat.sirName);
	}

}

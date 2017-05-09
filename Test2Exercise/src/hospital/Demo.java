package hospital;

import hospital.Hospital.Doctor;
import hospital.Hospital.Nurse;
import hospital.Hospital.Patient;

public class Demo {

	public static void main(String[] args) {


		Hospital hospital = new Hospital();
		
		Doctor orthopedist = new Doctor("Ivan", "Ivanov", "0898234543", "Orthopedy");
		Doctor virusologist = new Doctor("Georgi", "Georgiev", "0898234543", "Virusology");
		Doctor cardiologist = new Doctor("Vasil", "Vasilev", "0898234543", "Cardiology");
		
		Nurse orthoNurse = new Nurse("Ginka", "Ginkova", 26, 3, "0989343434");
		Nurse virusoNurse = new Nurse("Veska", "Veskova", 27, 4, "0989343434");
		Nurse cardioNurse = new Nurse("Ani", "Aneva", 24, 2, "0989343434");
		
		hospital.addDoctor(orthopedist);
		hospital.addDoctor(virusologist);
		hospital.addDoctor(cardiologist);
		hospital.addNurse(orthoNurse);
		hospital.addNurse(virusoNurse);
		hospital.addNurse(cardioNurse);
		
		Patient gosho = new Patient("male");
		Patient pesho = new Patient("male");
		Patient pena = new Patient("female");
		
		hospital.checkPatientIn(gosho, "Gosho", "Goshev", 30, "0897343234");
		hospital.checkPatientIn(pena, "Pena", "Peneva", 35, "07834562");
		hospital.checkPatientIn(pesho, "Pesho", "Peshev", 35, "07834562");

	}

}

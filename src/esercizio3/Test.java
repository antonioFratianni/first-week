package esercizio3;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {


        Doctor doctor1 = new Doctor("Mario", "Rossi", 123);
        Doctor doctor2 = new Doctor("Luigi", "Bianchi", 345);

        Patient patient1 = new Patient(1, doctor1);
        Patient patient2 = new Patient(2, doctor1);

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(doctor1);
        doctors.add(doctor2);

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);

        HealthcareCompany healthcareCompany = new HealthcareCompany(doctors, patients);

        healthcareCompany.printPatientsByDoctor(doctor1);

        healthcareCompany.statDoctor(doctors);

        Patient patient3 = new Patient(3, doctor1);
        healthcareCompany.addPatient(patient3);

    }
}

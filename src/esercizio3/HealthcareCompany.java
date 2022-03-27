package esercizio3;

import java.util.ArrayList;

public class HealthcareCompany {

    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public HealthcareCompany(ArrayList<Doctor> doctors, ArrayList<Patient> patients) {
        this.doctors = doctors;
        this.patients = patients;
    }

    public HealthcareCompany() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public boolean addPatient(Patient patient) {
        boolean check = true;

        if (check) {
            if ((checkDoctor(patient.getDoctor()) == true) && (checkDuplicatePatient(patient.getId()) == true)) {
                System.out.println("Il medico è presente nella lista");
                System.out.println("Valori non duplicati");
            }
            System.out.println("Il Paziente è inserito nella lista ");
            patients.add(new Patient(patient.getDoctor()));

        } else {
            check = false;
            System.out.println("Il Paziente non è inserito nella lista ");
        }
        return check;
    }

    public boolean checkDoctor(Doctor doctor) {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getId() == doctor.getId())
                return true;
            else {
                System.out.println("Il Medico non è presente nella lista");
            }
            System.out.println("Il Paziente è inserito nella lista Medici!");
            patients.add(new Patient(doctor));
        }
        return false;
    }

    public boolean checkDuplicatePatient(int id) {

        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return false;
            } else {
                System.out.println("Il paziente non è presente nella lista");
                break;
            }
        }
        return true;
    }

    public boolean checkDuplicateDoctor(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return true;
            } else
                System.out.println("Il medico non e presente nella lista");
        }
        return false;
    }

    public void printPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getDoctor().equals(doctor)) {
                System.out.println("Lista Pazienti: " + patients.get(i).getId());
            } else
                System.out.println("Nessuna Lista Presente!!");
        }
    }

    public void statDoctor(ArrayList<Doctor> doctors) {
        int max = 0;

        for (int i = 0; i < patients.size(); i++) {
            if(patients.get(i).getDoctor().equals(doctors.get(i)))
                max = patients.get(i).getDoctor().getId();
        }

        System.out.println("Il dottore con più pazienti ha il codice : " + max);
    }
}

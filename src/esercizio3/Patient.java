package esercizio3;

public class Patient {
    private int id;
    private Doctor doctor;

    public Patient(int id, Doctor doctor) {
        this.id = id;
        this.doctor = doctor;
    }

    public Patient(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public Patient() {
        this.id= 0;
        this.doctor = new Doctor();
    }

    public void setId(int id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {

    private List<String> MedicalHistory ; 
    private List<Appointment> appointments ;
    
    public Patient(String id, String name, List<String> medicalHistory) {
        super(id, name);
        MedicalHistory = medicalHistory;
        this.appointments = new ArrayList<>() ;
    }

    // Add appointment
    public void addAppointment ( Appointment appointment ) {
        appointments.add(appointment);
    }

    // Getter Setter
    public List<String> getMedicalHistory() {
        return MedicalHistory;
    }
    public void setMedicalHistory(List<String> medicalHistory) {
        MedicalHistory = medicalHistory;
    }
    public List<Appointment> getAppointments() {
        return appointments;
    }
    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    } 
}

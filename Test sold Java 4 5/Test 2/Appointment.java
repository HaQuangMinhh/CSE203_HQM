
public class Appointment {

    private String AppointmentId ; 
    private Patient patient ; 
    private Doctor doctor ; 
    private TimeSlot timeSlot ; 
    private AppointmentType type ;
    
    public Appointment(String appointmentId, Patient patient, Doctor doctor, TimeSlot timeSlot, AppointmentType type) {
        AppointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.timeSlot = timeSlot;
        this.type = type;
    }

    public String toString() {
        return "Appointment: " + type + ", Doctor: " + doctor.getName() + ", Patient: " + patient.getName() + ", Time: " + timeSlot.toString() ; 
    }


    public String getAppointmentId() {
        return AppointmentId;
    }
    public void setAppointmentId(String appointmentId) {
        AppointmentId = appointmentId;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public TimeSlot getTimeSlot() {
        return timeSlot;
    }
    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }
    public AppointmentType getType() {
        return type;
    }
    public void setType(AppointmentType type) {
        this.type = type;
    } 
}

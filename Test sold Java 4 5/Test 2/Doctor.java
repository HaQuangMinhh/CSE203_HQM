import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Doctor extends Person {

    private String Specialization ; //  Cardiologist, Dermatologist
    private Map<String, List<TimeSlot> >  availability ; 
    private int MaxPatientsPerDay ; 
    private int CurrentPatientCount ;
    

    public Doctor(String id, String name, String specialization, int maxPatientsPerDay) {
        super(id, name);
        Specialization = specialization;
        MaxPatientsPerDay = maxPatientsPerDay;

        availability = new HashMap<>() ;
        CurrentPatientCount = 0 ; 
    }
    public String getSpecialization() {
        return Specialization;
    }
    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }
    public Map<String, List<TimeSlot>> getAvailability() {
        return availability;
    }
    public void setAvailability(Map<String, List<TimeSlot>> availability) {
        this.availability = availability;
    }
    public int getMaxPatientsPerDay() {
        return MaxPatientsPerDay;
    }
    public void setMaxPatientsPerDay(int maxPatientsPerDay) {
        MaxPatientsPerDay = maxPatientsPerDay;
    }
    public int getCurrentPatientCount() {
        return CurrentPatientCount;
    }
    public void setCurrentPatientCount(int currentPatientCount) {
        CurrentPatientCount = currentPatientCount;
    } 

}

import java.sql.Date;

public class Tutoring implements Service {

    private String Id ; 
    private String TutorName ; 
    private String Subject ; 
    private boolean Availability ;
    private Date dueDate ; 
    
    
    
    public Tutoring(String id, String tutorName, String subject) {
        Id = id;
        TutorName = tutorName;
        Subject = subject;
    }



    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getTutorName() {
        return TutorName;
    }
    public void setTutorName(String tutorName) {
        TutorName = tutorName;
    }
    public String getSubject() {
        return Subject;
    }
    public void setSubject(String subject) {
        Subject = subject;
    }
    public boolean isAvailability() {
        return Availability;
    }
    public void setAvailability(boolean availability) {
        Availability = availability;
    }



    @Override
    public Boolean GetAvailability() {
        
        return this.Availability;
    }



    @Override
    public Date GetDueDate() {
        return this.dueDate ; 
    }



    @Override
    public Void SetAvailability(Boolean status) {
        return null ; 
    }



    @Override
    public void SetDueDate(Date dueDate) {
        // TODO Auto-generated method stub
        
    }  

    @Override
    public String toString() {
        return " id: " + Id + " , tutorName: " + TutorName + " , subject: " + Subject + " , isAvailable: " + Availability + " , dueDate: " + dueDate;
    }
}

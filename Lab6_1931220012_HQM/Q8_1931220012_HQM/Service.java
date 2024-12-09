import java.sql.Date;

public interface Service {

    void SetDueDate ( Date dueDate ); 
    Date GetDueDate() ;
    
    Void SetAvailability ( Boolean status ) ; 
    Boolean GetAvailability() ; 
    

}

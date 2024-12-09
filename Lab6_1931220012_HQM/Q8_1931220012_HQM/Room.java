import java.sql.Date;

public class Room implements Service {

    private String Id ; 
    private String Description ; 
    private int Capacity ; 
    private boolean IsAvailable ;
    private Date DueDate ; 
    
    
    public Room(String id, String description, int capacity) {
        Id = id;
        Description = description;
        Capacity = capacity;
        
    }
    
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public int getCapacity() {
        return Capacity;
    }
    public void setCapacity(int capacity) {
        Capacity = capacity;
    }
    

    @Override
    public String toString() {
        return "Room Class: " + " Id: " + Id + ", Description: " + Description + ", capacity: " + Capacity + ", Is Available: " + IsAvailable ;
    }
// ----------------------- Cần check 
    @Override
    public Boolean GetAvailability() {
        return null;
    }

    @Override
    public Date GetDueDate() {
        
        return null;
    }

    @Override
    public Void SetAvailability(Boolean status) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void SetDueDate(Date dueDate) {
        // set ngày nào 

    }

    

    

}

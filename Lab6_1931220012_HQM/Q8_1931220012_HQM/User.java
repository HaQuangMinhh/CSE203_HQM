import java.util.ArrayList;
import java.util.List;

public class User {
    private String Id ; 
    private String Name ; 
    private String Password ; 

    private List<Service> UsedServices = new ArrayList<>();


    public User(String id, String name) {
        Id = id;
        Name = name;
    }

    // Add Book 
    public void addBookedService ( Service s  ) {
        UsedServices.add(s);
    }

    // Remove 
    public void removeBookedService ( Service s  ) {
        UsedServices.remove(s);
    }



    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "User : " + " Id: " + Id + ", Name: " + Name + ", Password: " + Password ; 
    } 


    
}

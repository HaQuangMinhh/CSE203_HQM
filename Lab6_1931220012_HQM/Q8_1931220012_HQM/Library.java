import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private ArrayList<Service> Services ; 
    private ArrayList<User>   Users ;
    
    public Library() {
        Services = new ArrayList<>();
        Users = new ArrayList<>() ;
    } 
    // Add User
    public void addUser ( User u ) {
        Users.add(u);
    }

    // check User in a list
    public boolean containsUser ( User u ) {
        for ( var check : Users ) {
            if ( check.getId().equals(u.getId()) ) {
                return true ; 
            }
        }
        return false ; 
    }
    

    public void addService ( Service s  ) {
        Services.add(s); 
    }

    public void removeService ( Service s ) {
        Services.remove(s);
    }


    // Load Users from File 
    public void loadUsersFromFile ( File file ) {
        try {
            // Tên file đầu vào và read file 
            String output = "output.txt"; 
            File outputFile = new File(output);
            Scanner outputScanner = new Scanner(outputFile); 

            while ( outputScanner.hasNext() ) {  
                String currentLine = outputScanner.nextLine() ; 

                String[] result = currentLine.split(", ");

                String id = result[0] ; 
                String name = result[1] ; 
                String password = result[2] ; 

                User user = new User(id, name ) ; 
                user.setPassword(password);
    
                Users.add(user);   // added vào ArrayList
            } 
            System.out.println("Load Users successfully");
            
            outputScanner.close();


        } catch (IOException e) {
            System.out.println("Error LoadUsersFromFile r nka cha" + e);
        }
    }

    // Show User from ArrayList
    public void showUser () {
        for ( var show : Users ) {
            System.out.println(show);
        }
    } 

    // Save Users to File 
    public void saveUsersToFile (File file) {

        try {
            // Tên file đầu ra 
            String output = "output.txt";
            // Tạo đối tượng ghi vào File 
            FileWriter writer = new FileWriter(output, false ); 

            for ( User user : Users ) {
                writer.write(user.getId() + ", " + user.getName() + ", " + user.getPassword());
                writer.write("\n");

            }
            System.out.println("Save Users successfully");

            writer.close();
        } catch ( IOException e) {
            System.out.println("Error SaveUsersToFile r nka cha" + e);
        }
    }



    // searchService
    public ArrayList<Service> searchService (String keyWord) {
        
        ArrayList<Service> results = new ArrayList<>(); 

        // keyword nào so sánh với field nào 
        // So sánh == or contain 
        // LowerCase or UpperCase 

        for ( Service key  : Services ) {
            String infor = key.toString().toLowerCase(); 

            String searchKeyword = keyWord.toLowerCase();

            if ( infor.contains(searchKeyword )  ) {
                results.add(key);
            }
        }

        return results ;
    }

    // bookService 
    public boolean bookService ( User user , Tutoring tutoring1 , int loanPeriodHours ) {
        // if available ms dc thuê --> set True , cho thuê r -> set False 
        if ( ! containsUser(user) ) {
            System.out.println("this User not found");
            return false ; 
        } 
        if ( ! tutoring1.GetAvailability() ) {
            System.out.println("Service not available");
            return false ; 
        }

        LocalDateTime localDateTime = LocalDateTime.now().plus(loanPeriodHours, ChronoUnit.HOURS); 

        ZoneId vietnamTimeZone = ZoneId.of("Ho Chi Minh");
        Date date = (Date) Date.from(localDateTime.atZone(vietnamTimeZone).toInstant());

        tutoring1.SetAvailability(false);
        
        user.addBookedService(tutoring1);
        return true;


    }

    // returnService 
    public void returnService ( User user , Tutoring tutoring1 ) {
        tutoring1.setAvailability(true);

        tutoring1.SetDueDate(null);

        user.removeBookedService(tutoring1);
        
    }
    

    // getOverdueServiceFromUser : Quá hạn 
    // if có dueDate quá hạn thì save all nó vào 1 list r show lên 
    public ArrayList<Service> getOverdueServiceFromUser ( User u  ) {
        ArrayList<Service> overdueServices = new ArrayList<>(); 

        Date currentDate = new Date(1);
        
        return overdueServices ; 

    }


    // Getter and Setter
    public ArrayList<Service> getServices() {
        return Services;
    }
    public void setServices(ArrayList<Service> services) {
        Services = services;
    }
    public ArrayList<User> getUsers() {
        return Users;
    }
    public void setUsers(ArrayList<User> users) {
        Users = users;
    }
    


}

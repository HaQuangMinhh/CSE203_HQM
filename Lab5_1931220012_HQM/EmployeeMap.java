import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

    Map< Integer,Employee > employeeMap = new HashMap<>();
    

    public EmployeeMap() {
        employeeMap = new HashMap<>() ;
    } 

    // Method : addEmployee
    public void addEmployee ( Employee employee ) {
        employeeMap.put( employee.getEmployeeId() , employee ) ; 
        System.out.println("Added successfully: " + employee );
    }

    // Method : Search Employee 
    public Employee findEmployeeById ( int id ) {
        if ( employeeMap.containsKey(id) ) {
            return employeeMap.get(id) ; 
        } else {
            System.out.println("Don't have " + id + " in list");
            return null ; 
        }
    }

    public void removeEmployeeById (int id ) {
        if (employeeMap.containsKey(id)) {
            Employee employee = employeeMap.get(id);

            employeeMap.remove(id) ; 

            System.out.println("Removed successfully: " + employee.getEmployeeId() );
            
        } else {
            System.out.println("Don't have " + id + " in list");
        }

    }


    


    

    

}

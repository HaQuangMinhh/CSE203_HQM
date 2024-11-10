import java.time.LocalDate;

public class Employee {

    private String Name ; 
    private String Number ;
    private LocalDate HireDate ;
    
  
    // Constructor
    public Employee(String name, String number, LocalDate hireDate) {
        Name = name;
        Number = number;
        HireDate = hireDate;
    }


    @Override
    public String toString() {
        return "Name: " + Name + " , number: " + Number + " , Date: " + HireDate ; 
    }


    // Getter and Setter
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getNumber() {
        return Number;
    }
    public void setNumber(String number) {
        Number = number;
    }
    public LocalDate getHireDate() {
        return HireDate;
    }
    public void setHireDate(LocalDate hireDate) {
        HireDate = hireDate;
    }

}

import java.time.LocalDate;

public class ShiftSupervisor extends Employee {

    private double SallaryAnnually ;
    private double SallayBonus ;
    
    
    public ShiftSupervisor(String name, String number, LocalDate hireDate, double sallaryAnnually, double sallayBonus) {
        super(name, number, hireDate);
        SallaryAnnually = sallaryAnnually;
        SallayBonus = sallayBonus;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " , Number: " + getNumber() + " , Day: " + getHireDate() + " , Annual salary: " + SallaryAnnually + " , Bonus: " + SallayBonus  ; 
    } 
    

    // Getter and Setter
    public double getSallaryAnnually() {
        return SallaryAnnually;
    }
    public void setSallaryAnnually(double sallaryAnnually) {
        SallaryAnnually = sallaryAnnually;
    }
    public double getSallayBonus() {
        return SallayBonus;
    }
    public void setSallayBonus(double sallayBonus) {
        SallayBonus = sallayBonus;
    }

}

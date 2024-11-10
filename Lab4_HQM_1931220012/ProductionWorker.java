import java.time.LocalDate;

public class ProductionWorker extends Employee {
    private int Shift ; 
    private Double PayRate ;
    
    
    
    // Constructor 
    public ProductionWorker(String name, String number, LocalDate hireDate, int shift, Double payRate) {
        super(name, number, hireDate);
        Shift = shift;
        PayRate = payRate;
    }

    
    @Override
    public String toString() {
        FriendlyString convert = new FriendlyString();

        String friendlyStringShift = convert.getfriendlyStringShift( Shift ); 

        return "Name: " + getName() + " , Number: " + getNumber() + " , Day: " + getHireDate() + " , Shift: " + friendlyStringShift + " , Pay rate: "  + getPayRate() ; 
    } 


    // Getter and Setter 
    public int getShift() {
        return Shift;
    }
    public void setShift(int shift) {
        Shift = shift;
    }
    public Double getPayRate() {
        return PayRate;
    }
    public void setPayRate(Double payRate) {
        PayRate = payRate;
    }
}

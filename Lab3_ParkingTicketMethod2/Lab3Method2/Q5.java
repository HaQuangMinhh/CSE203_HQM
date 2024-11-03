import java.io.Console;
import java.util.Scanner;

public class Q5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ParkedCar parkedCar = new ParkedCar("Toyolta", "Camry", "Red", "123456" , 70 , 60);

        PoliceOfficer policeOfficer = new PoliceOfficer("Minh", "6933");

        var ticket = policeOfficer.CheckCar(parkedCar); 

        // show thử 
        // System.out.println( ticket.getMake() +", " + ticket.getModel() + ", " + ticket.getLicenseNumber() + ", " + ticket.getOfficerName() + ", " + ticket.getOfficerBagdeNumber() );
        
        // System.out.println("\n");

        // System.out.println( ticket.getFine() );
        // ----------------------------------------------------------------------

        if ( parkedCar.getParkedMinutes() >= parkedCar.getParkingMeter().getPurchasedMinutes() ) { 
            
            System.out.println( ticket.getMake() +", " + ticket.getModel() + ", " + ticket.getLicenseNumber() + ", " + ticket.getOfficerName() + ", " + ticket.getOfficerBagdeNumber() );
            System.out.println("\n");

            System.out.println( ticket.getFine() );
        } else {
            System.out.println("No ticket, yeahhhhhh");
        }
    


    }

}

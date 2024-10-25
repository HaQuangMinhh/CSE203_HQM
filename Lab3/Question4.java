import java.util.Scanner;

public class Question4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FuelGauge fuelGauge = new FuelGauge(); 
        Odometer odometer = new Odometer() ; 

        while ( fuelGauge.getCurrentAmount() < 15 ) {
            fuelGauge.increaseAmount();
        }

        // Liên kết với odometer
        odometer.setFuelGauge(fuelGauge);
        
        while (fuelGauge.getCurrentAmount() > 0) {
            odometer.increaseMileage(); 

            System.out.println("Mileage: " + odometer.getCurrentMileage() + " miles");
            
            System.out.println("Fuel: " + fuelGauge.getCurrentAmount() + " gallons");
            
            System.out.println("--------------------------");
        }

        System.out.println("the car is out of fuel");
        
    }


}

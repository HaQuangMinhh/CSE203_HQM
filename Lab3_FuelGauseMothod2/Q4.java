import java.util.Scanner;

public class Q4 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        FuelGauge fuelGauge = new FuelGauge() ;
        Odometer odometer = new Odometer() ; 

        Run(odometer, fuelGauge);

        System.out.println("-------------------------------------------");
        // fill fuel 1 gallon

        fuelGauge.FillFuel(10);
        // fuelGauge.FillFuel(5);
        
        // Run
        Run(odometer,fuelGauge); 


    }

    public static void Run (Odometer odometer , FuelGauge fuelGauge) {
        int countMile = 0 ; 

        while ( fuelGauge.getCurrentAmount() > 0 ) {
            odometer.Run();
            countMile++;
            if (countMile == 24 ) {
                fuelGauge.BurnFuel();
                countMile = 0 ; 
            }

            System.out.println( "Count: " + countMile + ", Mile: " + odometer.getCurrentMileage() + ", Fuel: " + fuelGauge.getCurrentAmount() );
            System.out.println("--------------------------------------------------------");
        }
        System.out.println("Run out of fuel");

    }


}

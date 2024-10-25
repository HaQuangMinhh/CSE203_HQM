import java.util.ArrayList;

public class Odometer {

    private int currentMileage ; 
    private FuelGauge fuelGauge ;
    private ArrayList<String> strings ; 
    

    public Odometer() {
        currentMileage = 0;
        fuelGauge = new FuelGauge() ;  // create a new FuelGauge
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void increaseMileage() {
        if ( currentMileage < 999999 ) {
            currentMileage++ ; 

            //  1 gallon for every 24 miles traveled
            if (currentMileage % 24 == 0) {
                fuelGauge.decreaseAmount();
            }
        } else {
            currentMileage = 0 ; 
        }
    }
    
    public void setFuelGauge(FuelGauge fuelGauge) {
        this.fuelGauge = fuelGauge;
    }

    public FuelGauge getFuelGauge() {
        return fuelGauge;
    }

}

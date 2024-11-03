public class Odometer {

    private int CurrentMileage ; 

    public int getCurrentMileage() {
        return CurrentMileage;
    }

    public Odometer() {
        CurrentMileage = 999980; 
    }

    public void Run() {
        if ( CurrentMileage == 999999 ) {
            CurrentMileage = 0 ; 
        }
        CurrentMileage++;
    }

}

public class FuelGauge {


    private int currentAmount ;
    private int maxFuel = 15 ; 

    public FuelGauge() {
        currentAmount = 0 ; 
    }

    public int getCurrentAmount() {
        return currentAmount;
    } 
    
    public void increaseAmount() {
        if ( currentAmount < maxFuel ) {
            currentAmount ++ ; 
        }

    }

    public void decreaseAmount() {
        if ( currentAmount > 0  ) {
            currentAmount -- ; 
        }
    }

}

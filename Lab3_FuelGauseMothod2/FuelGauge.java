public class FuelGauge {
    
    private int CurrentAmount ;

    public int getCurrentAmount() {
        return CurrentAmount;
    }

    public FuelGauge() {
        CurrentAmount = 0 ;
    }

    public boolean FillFuel() {
        if ( CurrentAmount < 15 ) {
            CurrentAmount++;
            return true; 
        }
        return false ;
    }
    
    public boolean FillFuel(int amountFilled) {
        if ( CurrentAmount + amountFilled <= 15 ) {
            CurrentAmount += amountFilled ;
            return true ; 
        }
        return false ; 
    }

    public void BurnFuel() {
        CurrentAmount-- ; 
    }

}

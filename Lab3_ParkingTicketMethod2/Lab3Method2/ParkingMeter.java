public class ParkingMeter {
    
    private int PurchasedMinutes ;

    
    public ParkingMeter( int purchasedMinutes) {
        PurchasedMinutes = purchasedMinutes;
    }


    // Getter and Setter
    public int getPurchasedMinutes() {
        return PurchasedMinutes;
    } 
    public void setPurchasedMinutes( int purchasedMinutes) {
        PurchasedMinutes = purchasedMinutes;
    }

}

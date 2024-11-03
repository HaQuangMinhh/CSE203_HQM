public class ParkedCar {
    
    private String Make ; 
    private String Model ; 
    private String Color ; 
    private String LicenseNumber ; 
    private int ParkedMinutes ;
    private ParkingMeter ParkingMeter ; 

    public ParkedCar(String make, String model, String color, String licenseNumber, int parkedMinutes , int purchasedMinutes) {
        Make = make;
        Model = model;
        Color = color;
        LicenseNumber = licenseNumber;
        ParkedMinutes = parkedMinutes;
        ParkingMeter = new ParkingMeter(purchasedMinutes);
    }


    public ParkingMeter getParkingMeter() {
        return ParkingMeter;
    }

    public void setParkingMeter(ParkingMeter parkingMeter) {
        ParkingMeter = parkingMeter;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public String getColor() {
        return Color;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public int getParkedMinutes() {
        return ParkedMinutes;
    }
    
    


}

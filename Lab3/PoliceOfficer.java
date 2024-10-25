public class PoliceOfficer {

    private String name ; 
    private String badgeNumber ;
    
    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBadgeNumber() {
        return badgeNumber;
    }
    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }
    


    public ParkingTicket checkCar ( ParkedCar parkedCar , ParkingMeter parkingMeter ) {
        if ( parkedCar.getParkedMinutes() > parkingMeter.getPurchasedMinutes() ) {
            // infor xe , tên và số hiệu ng phạt ở policeOfficer
            return new ParkingTicket(parkedCar, name, badgeNumber);
        }
        return null;
    }


}

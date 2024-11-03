public class PoliceOfficer {
    private String Name ; 
    private String BadgeNumber ;
    
    public PoliceOfficer(String name, String badgeNumber) {
        Name = name;
        BadgeNumber = badgeNumber;
    } 

    public ParkingTicket CheckCar(ParkedCar parkedCar) {
        var ticket = new ParkingTicket(parkedCar.getMake() , parkedCar.getModel(), parkedCar.getLicenseNumber() , Name , BadgeNumber) ; 
        
        ticket.CalculateFine( parkedCar.getParkingMeter().getPurchasedMinutes() , parkedCar.getParkedMinutes());

        return ticket ; 
    } 


}

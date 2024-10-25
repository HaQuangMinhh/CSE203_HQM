public class ParkingTicket {

    private ParkedCar parkedCar ; 
    private double fine ; 
    private String officerName ; 
    private String officerBadge ;
    
    public ParkingTicket(ParkedCar parkedCar, String officerName, String officerBadge) {
        this.parkedCar = parkedCar;
        this.officerName = officerName;
        this.officerBadge = officerBadge;
        CalculateFine();
    }

    // Calculate the amount of money fine
    private void CalculateFine() {
        int minutesOver = parkedCar.getParkedMinutes() - 60 ;
        // giả sử chỉ free dc an hour
        if ( minutesOver <= 0 ) {
            fine = 0 ; 
        } else {
            fine = 25 + ((minutesOver - 1) / 60) * 10 ;  
        }
    }


    // Getter tên của ng xử phạt
    public String getOfficerName() {
        return officerName;
    }

    public String getOfficerBadge() {
        return officerBadge;
    }
    
    public String getPackedCarInfor() {
        return "Make: " + parkedCar.getMake() + "\nMode: " + parkedCar.getModel() + "\nColor: " + parkedCar.getColor()  + "\nLicense number: " + parkedCar.getLicenseNumber();
    }

    public double getFine() {
        return fine;
    }
    
    
    
    



}

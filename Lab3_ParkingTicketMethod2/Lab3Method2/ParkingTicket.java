public class ParkingTicket {
    
    private String Make ; 
    private String Model ; 
    private String LicenseNumber ; 

    private int Fine ; 
    

    private String OfficerName ; 
    private String OfficerBagdeNumber ;
    
    public ParkingTicket(String make, String model, String licenseNumber, String officerName, String officerBagdeNumber) {
        Make = make;
        Model = model;
        LicenseNumber = licenseNumber;
        OfficerName = officerName;
        OfficerBagdeNumber = officerBagdeNumber;
    } 

    public void CalculateFine( int purchasedMinutes , int parkedMinutes ) {
        if ( parkedMinutes <= purchasedMinutes ) {
            Fine = 0 ; 
            return ; 
        } else {
            int minOver = parkedMinutes - purchasedMinutes ; 
            int hourOverRounded =  (int) Math.ceil( ((double)minOver /60 ) );
            Fine = 25 + ( hourOverRounded - 1 ) * 10 ; 
            return ; 
        }
    }

    public String getOfficerName() {
        return OfficerName;
    }

    public String getOfficerBagdeNumber() {
        return OfficerBagdeNumber;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        LicenseNumber = licenseNumber;
    }

    public void setOfficerName(String officerName) {
        OfficerName = officerName;
    }

    public void setOfficerBagdeNumber(String officerBagdeNumber) {
        OfficerBagdeNumber = officerBagdeNumber;
    }
    
    // Getter and Setter Fine
    public int getFine() {
        return Fine;
    }

    public void setFine(int fine) {
        Fine = fine;
    }
}

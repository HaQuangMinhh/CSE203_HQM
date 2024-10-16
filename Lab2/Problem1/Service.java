package Lab2.Problem1;

public class Service {

    private double CareCharges ; 
    private double GroomingService ;

    // Tax
    private double SalesTax = 0.05 ; 
    
    public Service() {} 

    public double getCareCharges() {
        return CareCharges;
    }
    public void setCareCharges(double careCharges) {
        CareCharges = careCharges;
    }
    public double getGroomingService() {
        return GroomingService;
    }
    public void setGroomingService(double groomingService) {
        GroomingService = groomingService;
    } 

// totalCost
    public double getTotalCost() {
        double totalCost = GroomingService + CareCharges ; 
        return totalCost + ( totalCost * SalesTax );
    }

}

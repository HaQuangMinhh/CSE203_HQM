public class RentalAgreement {

    private double baseRentalFee; 
    private double mileageFee; 
    private double taxRate = 0.07;
    
    // GETTER AND SETTER
    public double getBaseRentalFee() {
        return baseRentalFee;
    }
    public void setBaseRentalFee(double baseRentalFee) {
        this.baseRentalFee = baseRentalFee;
    }
    public double getMileageFee() {
        return mileageFee;
    }
    public void setMileageFee(double mileageFee) {
        this.mileageFee = mileageFee;
    }

    // Getter của tax rate
    public double getTaxRate() {
        return taxRate;
    }
   
    //  hàm tính toán 
    public double calculateTotalCost () {
        double total = baseRentalFee + mileageFee ; 
        return total + ( total * taxRate) ; 
    }

}

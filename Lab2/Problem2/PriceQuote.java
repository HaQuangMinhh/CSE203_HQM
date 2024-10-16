package Lab2.Problem2;

public class PriceQuote {

    private double CostIngredients ; 
    private double LaborCharges ;
    private double SalesTax = 0.06 ; 
    private double deliveryFee = 30000 ; 

    
    
    // Getter and Setter
    public double getCostIngredients() {
        return CostIngredients;
    }
    public void setCostIngredients(double costIngredients) {
        CostIngredients = costIngredients;
    }
    public double getLaborCharges() {
        return LaborCharges;
    }
    public void setLaborCharges(double laborCharges) {
        LaborCharges = laborCharges;
    } 
    // Getter salesTax
    public double getSalesTax() {
        return SalesTax;
    }
    // Getter DeliveryFee
    public double getDeliveryFee() {
        return deliveryFee;
    }

    // hàm tính toán 
    public double calculateTotalCost() {
        double total = CostIngredients + LaborCharges + deliveryFee ; 
        return total + ( total * SalesTax); 
    }


}

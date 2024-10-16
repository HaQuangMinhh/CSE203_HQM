package Lab2.Problem4;

public class Confirmation {

    private double BaseSessionFee ; 
    private double EdittingCharges ; 
    private  double SalesTax = 0.08 ; 

    public Confirmation() {}

    public double getBaseSessionFee() {
        return BaseSessionFee;
    }

    public void setBaseSessionFee(double baseSessionFee) {
        BaseSessionFee = baseSessionFee;
    }

    public double getEdittingCharges() {
        return EdittingCharges;
    }

    public void setEdittingCharges(double edittingCharges) {
        EdittingCharges = edittingCharges;
    }

    // Tax - create get của tax
    public double getSalesTax() {
        return SalesTax;
    }
    
    // hàm tính toán 
    public double calculateTotalCost() {
        double total = BaseSessionFee + EdittingCharges ; 
        return total + ( total * SalesTax ) ;
    }

}

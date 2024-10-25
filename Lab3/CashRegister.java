
public class CashRegister {

    private double SalesTax = 0.06;
    private RetailedItem Item;
    private int Quantity;

    // Constructor 
    public CashRegister(RetailedItem item, int quantity) {
        this.Item = item;
        this.Quantity = quantity;
    }

    // create to show ra 
    public double getSubtotal() {
        return Item.getPrice() * Quantity;
    }

    public double getSalesTax() {
        return SalesTax * getSubtotal();
    }

    // Hàm tính toán 
    public double CalculateTotalCost() {
        return getSubtotal() + getSalesTax();
    }

    @Override
    public String toString() {
        return "Subtotal: " + getSubtotal()
                + "\nTax: " + getSalesTax()
                + "\nTotalCost: " + CalculateTotalCost();
    }

}

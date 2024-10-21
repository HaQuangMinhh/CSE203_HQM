
public class RetailedItem {

    private String Description;
    private int UnitsOnHand;
    private double price;

    // Constructor
    public RetailedItem(String description, int unitsOnHand, double price) {
        Description = description;
        UnitsOnHand = unitsOnHand;
        this.price = price;
    }

    // Getter and Setter
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getUnitsOnHand() {
        return UnitsOnHand;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        UnitsOnHand = unitsOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Description : " + Description + ", Units On Hand= " + UnitsOnHand + ", price = " + price;
    }

}

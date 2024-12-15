
public class ShoppingItem {

    private String Description;
    private double Cost;

    public ShoppingItem(String Description, double Cost) {
        this.Cost = Cost;
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

}

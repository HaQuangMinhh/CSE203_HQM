public class PercentageDiscount implements DiscountStrategy {

    private double percentage ;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double cost) {
        
        return cost - ( cost * (percentage / 100 ) ) ;
    } 

}

public class FixedDiscount implements DiscountStrategy {

    private double money ; 

    public FixedDiscount(double money) {
        this.money = money;
    }

    @Override
    public double applyDiscount(double cost) {
        
        return cost - money  ;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}

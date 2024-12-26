public class NoDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double cost) {
        
        return cost;
    }


}

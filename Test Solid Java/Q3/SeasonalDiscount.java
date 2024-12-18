public class SeasonalDiscount implements IDiscountCalculator {

    @Override
    public double calculateDiscount(String category, double price , int quantity) {
        double discountRate = 0.1 ; 
        return price * discountRate ;
    }

}

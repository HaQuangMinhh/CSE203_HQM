public class BulkDiscount implements IDiscountCalculator {

    // Khi mua nhiều 
    @Override
    public double calculateDiscount(String category, double price, int quantity) {
        
        // Sử dụng điều kiện 3 ngôi 
        double discountRate = ( quantity >= 10 ) ? 0.15 : 0.05 ; 

        return price * discountRate ;
    }

    
    
}

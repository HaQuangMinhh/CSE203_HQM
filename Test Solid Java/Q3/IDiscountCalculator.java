public interface IDiscountCalculator {

    // should focus only on calculating discounts based on product categories or customer types.

    double calculateDiscount(String category , double price ,int quantiy ) ;     

}

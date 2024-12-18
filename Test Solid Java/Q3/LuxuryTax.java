public class LuxuryTax implements ITaxCalculator {

    @Override
    public double calculateTax(String category, double price) {
        if ( category.equalsIgnoreCase("luxury") ) {
            
            return price * 0.2 ;

        }
        return 0 ;
    }

}

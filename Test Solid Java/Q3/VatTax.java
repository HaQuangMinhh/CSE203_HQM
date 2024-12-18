public class VatTax implements ITaxCalculator {

    @Override
    public double calculateTax(String category, double price) {
        return price * 0.08 ; // 8%
    }

}

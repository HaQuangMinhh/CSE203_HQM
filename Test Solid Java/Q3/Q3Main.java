import java.util.ArrayList;

public class Q3Main {


    public static void main(String[] args) {
        
        // SRP 
        IDiscountCalculator discountCalculator = new BulkDiscount() ; 

        ITaxCalculator vatCalculator = new VatTax() ; 

        ITaxCalculator luxuryTaxCalculator = new LuxuryTax() ; 

        // truyền param 
        String category = "Snack"; 
        Double price = (double) 1000000 ; 
        int quantity = 20 ; 

        // Calculate Discount
        double discount =  discountCalculator.calculateDiscount(category, price, quantity); 
        System.out.println(discount + ", of " + category );

        // Calculate VAT
        double vat = vatCalculator.calculateTax(category, price - discount); 
        System.out.println(vat + ", of " + category);

        System.out.println("--------------------------------------");

        // Luxury Tax -- Khi mua nhiều  
        double luxuryTax = luxuryTaxCalculator.calculateTax(category, price - discount ) ; 
        System.out.println( "Luxury Tax: " + luxuryTax );

        

        // Final Price --> giá bao gồm all quantity 
        double finalPrice = ( price - discount ) + vat + luxuryTax ; 
        System.out.println("final Price: " + finalPrice + ", of " + category);

        System.out.println("--------------------------------------");
        
        // LSP 

        ArrayList<IDiscountCalculator> calculateDiscount = new ArrayList<>();

        
        
        

    }


}

public class Main {


    public static void main(String[] args) {
    
        // Order 1 : Fixed Discount 
        DiscountStrategy fixed = new FixedDiscount(10); 
        PaymentMethod credit = new CreditCard() ; 
        Order order1 = new Order(5, 100, fixed, credit); 
        order1.processOrder();

        //Order 2 : Percentage 
        DiscountStrategy percentage = new PercentageDiscount(10); 
        PaymentMethod ewallet = new EWallet() ; 
        Order order2 = new Order(9, 800, percentage, ewallet); 
        order2.processOrder();


    }

}


public class Q4Main {

    public static void main(String[] args) {

        // Strategy Pattern : change thuật toán + hành vi 
        ShoppingItem laptop = new ShoppingItem("Beautiful", 550000);
        ShoppingItem phone = new ShoppingItem("Large", 460000);
        
        // create several methods 
        IPaymentStrategy credit = new CreditCardPayment(111);
        IPaymentStrategy paypal = new PayPalPayment(112); 
        IPaymentStrategy cash = new CashPayment(1000);
        
        ShoppingCart shoppingCart = new ShoppingCart() ; 

        shoppingCart.addItem(laptop);
        shoppingCart.addItem(phone);

        // Show total 
        System.out.println("total amount: " + shoppingCart.calculateTotal());

        // Use method : Credit Card 
        shoppingCart.pay(credit);

        // Use method : Pay pal 
        shoppingCart.pay(paypal) ;

        // cash 
        shoppingCart.pay(cash);

    }

}

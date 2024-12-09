public class CreditCardPaymentProcessor implements IPaymentProcessor {

    @Override
    public void processPayment(Order order) {
        System.out.println("Processing payment: " + order.getTotalAmount() + " usin Credit Card ");

        System.out.println("Payment successful");
        
    }

}

public class PayPalPaymentProcessor implements IPaymentProcessor {

    @Override
    public void processPayment(Order order) {
        System.out.println("Processing payment: " + order.getTotalAmount() + " using Pay Pal ");

        System.out.println("Payment successful");
        
    }


}

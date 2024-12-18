public class PayPalProcessor implements IPaymentProcessor {

    @Override
    public void ProcessPayment(PaymentDetails details) {
        System.out.println("Using PayPal Processor of " + details.getAmount() + " , Currency: " + details.getCurrency() + ", Id: " + details.getTransactionId()  );
        
    }

}

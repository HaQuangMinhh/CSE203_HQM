public class CreditCardProcessor implements IPaymentProcessor {

    @Override
    public void ProcessPayment(PaymentDetails details) {
        System.out.println("Using Credit Card Processor of " + details.getAmount() + " , Currency: " + details.getCurrency() + ", Id: " + details.getTransactionId()  );
    }

}

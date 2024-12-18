public class PaymentService   {

    private IPaymentProcessor PaymentProcessor ; // DIP 
    

    public PaymentService(IPaymentProcessor paymentProcessor) {
        PaymentProcessor = paymentProcessor;
    }


   public void process (PaymentDetails details) {
        PaymentProcessor.ProcessPayment(details);
   }



}

public class OrderProcessor {

    private IOrderValidation orderValidation ; 
    private IPaymentProcessor paymentProcessor ; 
    private IOrderFulfillment Fulfillment ;
    
    public OrderProcessor(IOrderValidation orderValidation, IPaymentProcessor paymentProcessor, IOrderFulfillment fulfillment) {
        
        this.orderValidation = orderValidation;
        this.paymentProcessor = paymentProcessor;
        Fulfillment = fulfillment;
    } 

    public void process ( Order order ) {

        if ( orderValidation.validate( order ) ) {
            paymentProcessor.processPayment(order);
            Fulfillment.fulfillOrder(order);
        } else {

            System.out.println("Order processing failed due to errors");
        }
        
    }





}

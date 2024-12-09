public class Q5Main {

    public static void main(String[] args) {
        
        // Create an order 
        Order order1 = new Order(1, 5000) ; 
        order1.addItem("Laptop");

        Order order2 = new Order(2, 10000) ; 
        

        // Create components 
        OrderValidation validator = new OrderValidation();
        CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();
        OrderFulfillment fulfillment = new OrderFulFillment() ; 
        
        // Create OrderProcessor and process the order
        OrderProcessor orderProcessor = new OrderProcessor(validator, creditCardPaymentProcessor, fulfillment) ; 

        orderProcessor.process(order1);
        System.out.println("---------------------------------------------");

        // Create OrderProcessor and process the order ( NOT )
        orderProcessor.process(order2);     // show : No items in the List 





        

    }


}




public class Q1Main {

    public static void main(String[] args) {
        
        // 1. SRP 
        PaymentDetails one = new PaymentDetails(1, "VND",500000000 );

        PaymentDetails two = new PaymentDetails(2, "Dollar", 40000000); 

        
        System.out.println("-------------1.2-----------------------------");

        // OCP 
        CreditCardProcessor creditCard = new CreditCardProcessor(); 
        PayPalProcessor payPal = new PayPalProcessor();

        // DIP : modun cap cao 
        PaymentService payPalService = new PaymentService(payPal);
        PaymentService creditCardService = new PaymentService(creditCard);


        // Executing
        System.out.println("Processing payments using different methods:");
        payPalService.process(one);
        creditCardService.process(two);

        // Excuting from Interface
        System.out.println("-------------1.3-----------------------------");
        creditCard.ProcessPayment(one);
        payPal.ProcessPayment(two);


    }
}

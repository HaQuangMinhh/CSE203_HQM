public class Q3Main {

    public static void main(String[] args) {
        
        //Interface Segregation Principle (ISP)

        ICreditCardPayment creditCardPayment = new CreditCardPayment() ; 

        creditCardPayment.authorizePayment(500000);
        creditCardPayment.processRefund(400000);

        IPayPalPayment payPalPayment = new PayPalPayment() ; 
        payPalPayment.pay(600000);
        payPalPayment.processRefund(20000);

    }

}

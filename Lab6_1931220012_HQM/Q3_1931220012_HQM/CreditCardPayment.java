public class CreditCardPayment implements ICreditCardPayment {

    @Override
    public void authorizePayment(double money) {
       System.out.println("Authorizing credit card payment:  " + money);
    }

    @Override
    public void processRefund(double money) {
        System.out.println("Processiing credit card refund: " + money);
    }



}

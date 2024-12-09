public class PayPalPayment implements IPayPalPayment {

    @Override
    public void pay(double money) {
        System.out.println("Paying: " + money + " via PalPal");
        
    }

    @Override
    public void processRefund(double money) {
        System.out.println("Processing money: " + money + " refund");
    }


}

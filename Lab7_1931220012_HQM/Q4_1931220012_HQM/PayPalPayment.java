
public class PayPalPayment implements IPaymentStrategy {

    private int paypalCard;

    public PayPalPayment(int paypalCard) {
        this.paypalCard = paypalCard;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying: " + amount + ", with number Card: " + paypalCard);

    }

}

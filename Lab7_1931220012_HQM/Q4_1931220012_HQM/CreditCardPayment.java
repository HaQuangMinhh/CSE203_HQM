
public class CreditCardPayment implements IPaymentStrategy {

    private int CardNumber;

    public CreditCardPayment(int cardNumber) {
        CardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pay: " + amount + " using CreditCardPayment with number card:  " + CardNumber);
    }

}


public class CashPayment implements IPaymentStrategy {

    private int numberCard;

    public CashPayment(int numberCard) {
        this.numberCard = numberCard;
    }

    public int getNumberCard() {
        return numberCard;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pay: " + amount + ", with number Card: " + numberCard);

    }
}

public class EWallet implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        
        System.out.println("Paid: " + amount + " using E wallet");
    }


}

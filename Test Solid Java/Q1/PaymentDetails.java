public class PaymentDetails {

    private double Amount ;  // money 
    private String Currency ;   // VND , Dollar 
    private int TransactionId ;  // Id : 1 , 2 
    
    
    public PaymentDetails(int transactionId , String currency , double amount ) {
        Amount = amount;
        Currency = currency;
        TransactionId = transactionId;
    }

    public double getAmount() {
        return Amount;
    }
    public void setAmount(double amount) {
        Amount = amount;
    }
    public String getCurrency() {
        return Currency;
    }
    public void setCurrency(String currency) {
        Currency = currency;
    }
    public int getTransactionId() {
        return TransactionId;
    }
    public void setTransactionId(int transactionId) {
        TransactionId = transactionId;
    }


}

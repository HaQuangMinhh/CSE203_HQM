public interface ICreditCardPayment {

    void authorizePayment( double money ) ; 
    void processRefund( double money ); 

}

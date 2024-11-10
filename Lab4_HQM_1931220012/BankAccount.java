public abstract class BankAccount {
    
    private double Balance ; 
    private int DepositsMonthly ; // số lần tiền gửi 
    private int WithDrawals ; // số lần rút tiền 
    private double AnnualInterestRate ; 
    private double ServiceCharges ;
    
    
    public BankAccount( double balance, double annualInterestRate ) {
        Balance = balance;
        DepositsMonthly = 0 ;
        WithDrawals = 0 ; 
        AnnualInterestRate = annualInterestRate;
        ServiceCharges = 0 ;
    }

    public void deposit ( double money ) {
        if (money > 0 ) {
            Balance += money ;
            DepositsMonthly++ ;  // số lần tiền gửi 
        }
    }

    public void withDrawals ( double money ) {
        if ( money > 0 && money <= Balance ) {
            Balance -= money ; 
            WithDrawals++ ; // số lần rút tiền
        }
    }

    // tính lãi
    public void calcInterest () {

        double monthlyInterestRate = ( AnnualInterestRate / 12 ) ;
        double monthlyInterest = Balance * monthlyInterestRate ; 
        Balance += monthlyInterest ;  
    }


    public void monthlyProcess() {
        // cuối tháng trừ bớt ra 
        Balance -= ServiceCharges ; 
        calcInterest();
        WithDrawals = 0 ;
        DepositsMonthly = 0 ; 
        ServiceCharges = 0 ; 
    }


    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }
    public double getDepositsMonthly() {
        return DepositsMonthly;
    }
    public void setDepositsMonthly(int depositsMonthly) {
        DepositsMonthly = depositsMonthly;
    }
    public double getWithDrawals() {
        return WithDrawals;
    }
    public void setWithDrawals(int withDrawals) {
        WithDrawals = withDrawals;
    }
    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        AnnualInterestRate = annualInterestRate;
    }
    public double getServiceCharges() {
        return ServiceCharges;
    }
    public void setServiceCharges(double serviceCharges) {
        ServiceCharges = serviceCharges;
    } 
}

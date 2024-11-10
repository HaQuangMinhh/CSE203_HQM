public class SavingsAccount extends BankAccount {

    private boolean status ;

    
    
    
    public SavingsAccount(double balance, double annualInterestRate, boolean status) {
        super(balance, annualInterestRate);
        this.status = status;
    }

    @Override       // viết lại logic mới 
    public void deposit ( double money ) {
        if ( status == false ) {
            if (getBalance() + money > 25) {
                status = true; 
            }
        } 
        super.deposit(money);   // dùng 1 hàm của bên cha kéo qua cho con xài 
    }

    @Override       // Viết lại logic mới 
    public void withDrawals (double money) {
        if ( status == true  ) {
            super.withDrawals(money);
        } else {
            System.out.println("Wrong account");
        }
    }

    @Override
    public void monthlyProcess() {
        if ( getWithDrawals() > 4 ) {
            double chargesMoney = getWithDrawals() - 4 ;
            setServiceCharges(chargesMoney);
        }
    } 


    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    } 
    


}

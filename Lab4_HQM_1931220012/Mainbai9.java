public class Mainbai9 {
    
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount(500, 1.5, true);

        // Show số dư ban đầu 
        System.out.println("Initial Balance: " + savingsAccount.getBalance());
        
        // create deposits 
        savingsAccount.deposit(60);

        // Deposit
        System.out.println( "Balance after deposits: " + savingsAccount.getBalance() );
        System.out.println("Number of deposits: " + savingsAccount.getDepositsMonthly());

        // Withdraw money 
        savingsAccount.withDrawals(50);
        savingsAccount.withDrawals(100);

        System.out.println("Balance after withdrawals: " + savingsAccount.getBalance());
        System.out.println("Number of Withdrawals: " + savingsAccount.getWithDrawals());

        System.out.println("---------------------------------------------------");
        savingsAccount.monthlyProcess();

        System.out.println("Final balance after monthly process: " + savingsAccount.getBalance() );

        System.out.println("Service charges for the month: " + savingsAccount.getServiceCharges() );

        System.out.println("Account Status: " + (savingsAccount.isStatus() ? "Active" : "Inactive"));

        
    }



}

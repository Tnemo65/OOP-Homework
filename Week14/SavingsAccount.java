public class SavingsAccount extends Account {
    /** constructor. */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * withdraw.
     * 
     */
    @Override
    public void withdraw(double amount) {
        try {
            doWithdrawing(amount);
        } catch (InsufficientFundsException | InvalidFundingAmountException e) {
            e.printStackTrace();
        }
    }

    /**
     * deposit.
     * 
     */
    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}
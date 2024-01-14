public class CheckingAccount extends Account {

    /** constructor. */
    public CheckingAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /** withdraw. */
    @Override
    public void withdraw(double amount) {
        try {
            doWithdrawing(amount);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        } catch (InvalidFundingAmountException e) {
            e.printStackTrace();
        }
    }

    /** deposit. */
    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}

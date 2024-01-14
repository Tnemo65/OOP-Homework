import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public Account() {

    }

    /** readCustomerList. */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /** getAccountNumber. */
    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    /** doWithdrawing. */
    public void doWithdrawing(double amount) throws InsufficientFundsException,
            InvalidFundingAmountException {
        if (amount < 0) {
            throw new InsufficientFundsException(amount);
        }
        if (this.getBalance() - amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        if (this instanceof SavingsAccount) {
            if (this.getBalance() - amount < 5000) {
                throw new InvalidFundingAmountException(amount);
            }
            if (amount > 1000) {
                throw new InsufficientFundsException(amount);
            }
        }
        int type;
        if (this instanceof SavingsAccount) {
            type = Transaction.TYPE_WITHDRAW_SAVINGS;
        } else {
            type = Transaction.TYPE_WITHDRAW_CHECKING;
        }
        Transaction temp = new Transaction(type, amount, balance, balance - amount);
        temp.type = type;
        transactionList.add(temp);
        this.balance -= amount;
    }

    /**
     * doDepositing.
     */
    public void doDepositing(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new InsufficientFundsException(amount);
        }
        int type;
        if (this instanceof SavingsAccount) {
            type = Transaction.TYPE_DEPOSIT_SAVINGS;
        } else {
            type = Transaction.TYPE_DEPOSIT_CHECKING;
        }
        Transaction temp = new Transaction(type, amount, balance, balance + amount);
        temp.type = type;
        transactionList.add(temp);
        this.balance += amount;
    }

    /**
     * withdraw.
     */
    public abstract void withdraw(double amount);

    /** deposit. */
    public abstract void deposit(double amount);

    /** getTransactionHistory. */
    public String getTransactionHistory() {
        String res = "";
        res += "Lịch sử giao dịch của tài khoản ";
        res += this.accountNumber + ":" + "\n";
        for (Transaction i : transactionList) {
            res += i.getTransactionSummary() + "\n";
        }
        return String.valueOf(res);
    }

    /** addTransaction. */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /** equals. */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Account) {
            Account a = (Account) o;
            if (a.accountNumber == this.accountNumber) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

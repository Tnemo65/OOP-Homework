public class Transaction {
    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * Hàm khởi tạo chứa tham số.
     */
    Transaction(String opString, double amount, double balance) {
        this.operation = opString;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Hàm setOperation.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Hàm setAmount.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Hàm setBalance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Hàm getOperation.
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * Hàm getAmount.
     */
    public double getAmount() {
        return this.amount;
    }

    /**
     * Hàm getBalance.
     */
    public double getBalance() {
        return this.balance;
    }
}

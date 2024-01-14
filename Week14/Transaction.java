public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;
    public int type;
    private final double amount;
    private final double initialBalance;
    private final double finalBalance;

    /** Transaction. */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /** Transaction. */
    public Transaction(double amount, double initialBalance, double finalBalance) {
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /** getTransactionTypeString. */
    public String getTransactionTypeString(int type) {
        String res = "";
        if (type == Transaction.TYPE_DEPOSIT_SAVINGS) {
            res = "Nạp tiền tiết kiệm";
        } else if (type == Transaction.TYPE_WITHDRAW_SAVINGS) {
            res = "Rút tiền tiết kiệm";
        } else if (type == Transaction.TYPE_DEPOSIT_CHECKING) {
            res = "Nạp tiền vãng lai";
        } else if (type == Transaction.TYPE_WITHDRAW_CHECKING) {
            res = "Rút tiền vãng lai";
        } else {
            res = "";
        }
        return res;
    }

    /** getTransactionSummary. */
    public String getTransactionSummary() {
        String ans = "";
        String types = getTransactionTypeString(this.type);
        ans += "- Kiểu giao dịch: " + types;
        ans += ". Số dư ban đầu: $" + String.format("%.2f", this.initialBalance);
        ans += ". Số tiền: $" + String.format("%.2f", this.amount);
        ans += ". Số dư cuối: $" + String.format("%.2f", this.finalBalance) + ".";
        return ans;
    }
}

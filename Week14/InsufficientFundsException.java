public class InsufficientFundsException extends BankException {
    /** InsufficientFundsException. */
    public InsufficientFundsException(double amount) {
        super("Số tiền không hợp lệ: $" + String.format("%.2f", amount));
    }
}
import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    /**
     * Hàm nạp tiền.
     */
    private void deposit(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        } else {
            balance += amount;
        }
    }

    /**
     * Hàm rút tiền.
     */
    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        } else {
            balance -= amount;
        }
    }

    /**
     * Hàm thêm giao dịch.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
            transitionList.add(new Transaction(operation, amount, balance));
        } else if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
            transitionList.add(new Transaction(operation, amount, balance));
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Hàm in giao dịch.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            System.out.print("Giao dich " + (i + 1) + ": ");
            String operation = transitionList.get(i).getOperation();
            if (operation.equals(Transaction.WITHDRAW)) {
                System.out.print("Rut tien $");
            } else {
                System.out.print("Nap tien $");
            }
            System.out.print((double) Math.round(transitionList.get(i).getAmount() * 100) / 100);
            if (Math.round(transitionList.get(i).getAmount() * 100) % 10 == 0) {
                System.out.print("0");
            }
            System.out.print(". So du luc nay: $");
            System.out.print((double) Math.round(transitionList.get(i).getBalance() * 100) / 100);
            if (Math.round(transitionList.get(i).getBalance() * 100) % 10 == 0) {
                System.out.print("0");
            }
            System.out.println(".");
        }
    }
    // public static void main(String[] args) {
    // Account acc= new Account();
    // acc.addTransaction(2000.255,"deposit");
    // acc.addTransaction(1000,"withdraw");
    // acc.printTransaction();
    // }
}

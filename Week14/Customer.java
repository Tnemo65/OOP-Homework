import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private final List<Account> accountList = new ArrayList<>();

    /** Customer. */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /** Customer. */
    public Customer() {

    }

    /** getIdNumber. */
    public long getIdNumber() {
        return this.idNumber;
    }

    /** getFullName. */
    public String getFullName() {
        return this.fullName;
    }

    /** getAccountList. */
    public List<Account> getAccountList() {
        return this.accountList;
    }

    /** setIdNumber. */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /** setFullName. */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /** getCustomerInfo. */
    public String getCustomerInfo() {
        String ans = "";
        ans += "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
        return ans;
    }

    /** addAccount. */
    public void addAccount(Account acc) {
        accountList.add(acc);
    }

    /** removeAccount. */
    public void removeAccount(Account acc) {
        accountList.remove(acc);
    }
}

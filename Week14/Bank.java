import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private final List<Customer> customerList = new ArrayList<>();

    /** readCustomerList. */

    public void readCustomerList(InputStream inputStream) {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        Customer customer = null;

        String line;
        try {
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                String[] words = line.split("\\s+");
                char first = line.charAt(0);
                if (!(Character.isAlphabetic(first))) {
                    Account account;
                    String accountType = words[1];
                    if (accountType.equals(Account.CHECKING)) {
                        account = new CheckingAccount(
                                Long.parseLong(words[0]), Double.parseDouble(words[2]));
                    } else {
                        account = new SavingsAccount(
                                Long.parseLong(words[0]), Double.parseDouble(words[2]));
                    }
                    assert customer != null;
                    customer.addAccount(account);
                } else if ((Character.isAlphabetic(first))) {
                    String id = words[words.length - 1];
                    customer = new Customer(Long.parseLong(id), line.replace(id, "").trim());
                    customerList.add(customer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /** getCustomersInfoByNameOrder. */
    public String getCustomersInfoByNameOrder() {
        // Sắp xếp danh sách khách hàng theo tên
        Collections.sort(customerList, new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                String name1 = customer1.getFullName();
                String name2 = customer2.getFullName();
                return name1.compareTo(name2);
            }
        });

        // Xây dựng chuỗi kết quả
        String ans = "";
        int size = customerList.size();
        for (int i = 0; i < size; i++) {
            ans += customerList.get(i).getCustomerInfo();
            if (i != size - 1) {
                ans += "\n";
            }
        }

        return ans.toString();
    }

    /** getCustomersInfoByIdOrder. */

    public String getCustomersInfoByIdOrder() {
        // Sắp xếp danh sách khách hàng theo ID
        Collections.sort(customerList, new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                long id1 = customer1.getIdNumber();
                long id2 = customer2.getIdNumber();
                return Long.compare(id1, id2);
            }
        });

        // Xây dựng chuỗi kết quả
        String ans = "";
        for (int i = 0; i < customerList.size(); i++) {
            ans += customerList.get(i).getCustomerInfo();
            if (i != customerList.size() - 1) {
                ans += "\n";
            }
        }

        return ans.toString();
    }

    /** getCustomerList. */

    public List<Customer> getCustomerList() {
        return this.customerList;
    }
}

public class Person {
    private String name;
    private String address;

    /**
     * Hàm khởi tạo có tham số.
     */
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Hàm setName.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Hàm setAddress.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Hàm getName.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Hàm getAddress.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Hàm toString.
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}

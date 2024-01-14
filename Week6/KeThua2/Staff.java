public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Hàm khởi tạo có tham số.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Hàm getSchool.
     */
    public String getSchool() {
        return this.school;
    }

    /**
     * Hàm setSchool.
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Hàm getPay.
     */
    public double getPay() {
        return this.pay;
    }

    /**
     * Hàm setPay.
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Hàm toString.
     */
    public String toString() {
        return "Staff[" + super.toString()
                + ",school=" + school
                + ",pay=" + pay + "]";
    }
}

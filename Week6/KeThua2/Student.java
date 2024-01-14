public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Hàm khởi tạo có tham số.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.fee = fee;
        this.program = program;
        this.year = year;
    }

    /**
     * Hàm getProgram.
     */
    public String getProgram() {
        return program;
    }

    /**
     * Hàm setProgram.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Hàm setYear.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Hàm getYear.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Hàm setFee.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Hàm getFee.
     */
    public double getFee() {
        return this.fee;
    }

    /**
     * Hàm toString.
     */
    public String toString() {
        return "Student[" + super.toString()
                + ",program=" + program
                + ",year=" + year
                + ",fee=" + fee + "]";
    }
}

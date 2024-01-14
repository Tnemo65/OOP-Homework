public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Ham khởi tạo đầy đủ.
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * Hàm abstract getInfo.
     */
    protected abstract String getInfo();

    /**
     * Hàm transferOwnership.
     */
    public void transferOwnership(Person owner) {
        this.setOwner(owner);
    }

    /**
     * Hàm getBrand.
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Hàm setBrand.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Hàm getModel.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Hàm setModel.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Hàm getRegistrationNumber.
     */
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /**
     * Hàm setRegistrationNumber.
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Hàm getOwner.
     */
    public Person getOwner() {
        return this.owner;
    }

    /**
     * Hàm setBrand.
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

}

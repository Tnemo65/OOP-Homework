public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Hàm khởi tạo đầy đủ.
     */
    public MotorBike(String brand, String model, String registrationNumber,
            Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Ham getInfo.
     */
    @Override
    public String getInfo() {
        String brand = super.getBrand();
        String model = super.getModel();
        String number = super.getRegistrationNumber();
        boolean hasSidecar = this.isHasSidecar();
        String name = super.getOwner().getName();
        String address = super.getOwner().getAddress();
        String ans = "Motor Bike:" + "\n"
                + "\t" + "Brand: " + brand + "\n"
                + "\t" + "Model: " + model + "\n"
                + "\t" + "Registration Number: " + number + "\n"
                + "\t" + "Has Side Car: " + hasSidecar + "\n"
                + "\t" + "Belongs to " + name + " - "
                + address + "\n";
        return ans;
    }

    /**
     * Hàm isHasSidecar.
     */
    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    /**
     * Hàm setHasSidecar.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

}

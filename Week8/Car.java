public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Hàm khởi tạo đầy đủ.
     */
    public Car(String brand, String model, String resgistrationNumber,
            Person owner, int numberOfDoors) {
        super(brand, model, resgistrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Hàm getInfo.
     */
    @Override
    public String getInfo() {
        String brand = super.getBrand();
        String model = super.getModel();
        String number = super.getRegistrationNumber();
        int numDoors = this.getNumberOfDoors();
        String name = super.getOwner().getName();
        String address = super.getOwner().getAddress();
        String ans = "Car:" + "\n"
                + "\t" + "Brand: " + brand + "\n"
                + "\t" + "Model: " + model + "\n"
                + "\t" + "Registration Number: " + number + "\n"
                + "\t" + "Number of Doors: " + numDoors + "\n"
                + "\t" + "Belongs to " + name + " - "
                + address + "\n";
        return ans;
    }

    /**
     * Hàm getNumberDoors.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Hàm setNumberOfDoors.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

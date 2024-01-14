import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * Hàm khởi tạo 2 tham số.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Hàm addVehicle.
     */
    public void addVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            vehicleList.add(vehicle);
        }
    }

    /**
     * Hàm removeVehicle.
     */
    public void removeVehicle(String registration) {
        boolean found = false;
        if (vehicleList.isEmpty() == true) {
            return;
        }
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRegistrationNumber().equals(registration) == true) {
                if (vehicle != null) {
                    found = true;
                    vehicleList.remove(vehicle);
                    break;
                }
            }
        }
        if (found == false) {
            return;
        }
    }

    /**
     * Hàm getVehiclesListInfo.
     */
    public String getVehiclesInfo() {
        String ans = "";
        if (vehicleList.isEmpty() == true) {
            ans = ans + this.name + " has no vehicle!";
        } else {
            ans = ans + this.name + " has:" + "\n" + "\n";
            for (Vehicle vehicle : vehicleList) {
                if (vehicle instanceof Car) {
                    Car car = (Car) vehicle;
                    ans = ans + car.getInfo();
                } else if (vehicle instanceof MotorBike) {
                    MotorBike moto = (MotorBike) vehicle;
                    ans = ans + moto.getInfo();
                }
            }
        }
        return ans;
    }

    /**
     * Hàm getName.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Hàm setName.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Hàm getAddress.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Hàm setAddress.
     */
    public void setAddress(String address) {
        this.address = address;
    }

}

public class Cylinder extends Circle {
    private double height = 1.0;

    /**
     * Hàm khởi tạo mặc định.
     */
    public Cylinder() {

    }

    /**
     * Hàm khởi tạo với tham số radius.
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * Hàm khởi tạo với 2 tham số radius và height.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Hàm khởi tạo với 3 tham số.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Hàm setHeight.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Hàm getHeight.
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Hàm getVolume.
     */
    public double getVolume() {
        return this.height * super.getArea();
    }

    /**
     * Hàm getArea.
     */
    public double getArea() {
        return 2 * (super.getArea() + Circle.PI + getRadius() * height);
    }

    /**
     * Hàm toString.
     */
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
}

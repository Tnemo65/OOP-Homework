public class Circle {
    private double radius = 1.0;
    private String color = "blue";
    protected static final double PI = 3.14;

    /**
     * Hàm toString.
     */
    public String toString() {
        return "Circles[radius=" + radius + ",color=" + color + "]";
    }

    /**
     * Hàm khởi tạo mặc định.
     */
    public Circle() {

    }

    /**
     * Hàm khởi tạo với tham số radius.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Hàm khởi tạo với 2 tham số radius và color.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Hàm getRadius.
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Hàm setRadius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Hàm getColor.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Hàm setColor.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Hàm getArea.
     */
    public double getArea() {
        return (this.radius * this.radius * Circle.PI);
    }
}

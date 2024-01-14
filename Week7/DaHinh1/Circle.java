public class Circle extends Shape {
    protected double radius;

    /** Hàm khởi tạo không tham số. */

    public Circle() {

    }

    /** Hàm khởi tạo 1 tham số. */

    public Circle(double radius) {
        this.radius = radius;
    }

    /** Hàm khởi tạo 3 tham số. */

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /** Hàm getRadius. */

    public double getRadius() {
        return this.radius;
    }

    /** Hàm setRadius. */

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** toString. */

    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }

}

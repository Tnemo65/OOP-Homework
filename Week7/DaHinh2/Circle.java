import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

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

    /** Hàm khởi tạo 4 tham số. */

    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    /** Hàm getRadius. */

    public double getRadius() {
        return this.radius;
    }

    /** Hàm setRadius. */

    public void setRadius(double r) {
        this.radius = r;
    }

    /** Hàm setCenter. */

    public void setCenter(Point p) {
        this.center = p;
    }

    /** Hàm getCenter. */

    public Point getCenter() {
        return this.center;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Hàm equals. */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle) o;
            if ((Objects.equals(c.getCenter(), this.center))
                    && (Double.compare(c.getRadius(), this.radius) == 0)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = Objects.hash(radius, center);
        return hash;
    }

    /** toString. */

    public String toString() {
        double fixedRadius = (double) Math.round(this.radius * 10.0) / 10;
        double fixedX = (double) Math.round(center.getPointX() * 10.0) / 10;
        double fixedY = (double) Math.round(center.getPointY() * 10.0) / 10;
        return "Circle[center=" + "(" + fixedX + "," + fixedY + ")"
                + ",radius=" + fixedRadius
                + ",color=" + getColor() + ",filled=" + isFilled() + "]";
    }

}

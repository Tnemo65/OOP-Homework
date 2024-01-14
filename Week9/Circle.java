public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * Hàm khởi tạo 2 tham số.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return PI * this.radius * 2;
    }

    /**
     * Hàm getInfo.
     */

    @Override
    public String getInfo() {
        String ans = "Circle[" + "(" + String.format("%.2f", this.center.getPointX())
                + "," + String.format("%.2f", this.center.getPointY()) + "),"
                + "r=" + String.format("%.2f", this.radius) + "]";
        return ans;
    }
}

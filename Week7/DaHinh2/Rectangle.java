import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /** Hàm khởi tạo không tham số. */

    public Rectangle() {

    }

    /** Hàm khởi tạo 2 tham số. */

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /** Hàm khởi tạo 4 tham số. */

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /** Hàm khởi tạo 5 tham số. */

    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    /** Hàm getTopLeft. */

    public Point getTopLeft() {
        return this.topLeft;
    }

    /** Hàm setTopLeft. */

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /** Hàm setWidth. */

    public void setWidth(double width) {
        this.width = width;
    }

    /** Hàm setLength. */

    public void setLength(double length) {
        this.length = length;
    }

    /** Hàm setWidth. */

    public double getWidth() {
        return this.width;
    }

    /** Hàm getLength. */

    public double getLength() {
        return this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle r = (Rectangle) o;
            if ((Double.compare(this.length, r.getLength()) == 0)
                    && (Double.compare(this.width, r.getWidth()) == 0)
                    && (Objects.equals(this.topLeft, r.getTopLeft()))) {
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
        int hash = Objects.hash(width, length, topLeft);
        return hash;
    }

    /** toString. */

    public String toString() {
        double fixedWidth = (double) Math.round(width * 10.0) / 10;
        double fixedLength = (double) Math.round(length * 10.0) / 10;
        return "Rectangle[topLeft=" + topLeft.toString()
                + ",width=" + fixedWidth
                + ",length=" + fixedLength
                + ",color=" + getColor() + ",filled=" + isFilled() + "]";
    }
}

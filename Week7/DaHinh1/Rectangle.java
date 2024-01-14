public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /** Hàm khởi tạo không tham số. */

    public Rectangle() {

    }

    /** Hàm khởi tạo 2 tham số. */

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    /** Hàm khởi tạo 4 tham số. */

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
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

    /** toString. */

    public String toString() {
        return "Rectangle[width=" + this.width
                + ",length=" + this.length
                + ",color=" + this.color
                + ",filled=" + this.filled + "]";
    }
}

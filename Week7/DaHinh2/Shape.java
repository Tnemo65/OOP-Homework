public abstract class Shape {
    protected String color;
    protected boolean filled;

    /** Hàm khởi tạo không tham số. */

    public Shape() {

    }

    /** Hàm khởi tạo 2 tham số. */

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /** Hàm getColor. */

    public String getColor() {
        return this.color;
    }

    /** Hàm setColor. */

    public void setColor(String color) {
        this.color = color;
    }

    /** Hàm check filled. */

    public boolean isFilled() {
        if (this.filled == true) {
            return true;
        } else {
            return false;
        }
    }

    /** Hàm setFilled. */

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    /** toString. */
    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}

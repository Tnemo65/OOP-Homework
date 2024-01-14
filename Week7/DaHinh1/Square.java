public class Square extends Rectangle {
    /** Hàm khởi tạo không tham số. */

    public Square() {

    }

    /** Hàm khởi tạo 1 tham số. */

    public Square(double side) {
        super(side, side);
    }

    /** Hàm khởi tạo 3 tham số. */

    public Square(double side, String color, boolean filled) {
        super(side, side);
        this.color = color;
        this.filled = filled;
    }

    /** Hàm getSide. */

    public double getSide() {
        return super.getWidth();
    }

    /** Hàm setSide. */

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /** toString. */
    @Override
    public String toString() {
        return "Square[side=" + super.getLength()
                + ",color=" + super.getColor()
                + ",filled=" + super.isFilled() + "]";
    }
}
import java.util.Objects;

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

    /** Hàm khởi tạo 4 tham số. */

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);

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

    /** Hàm equals. */

    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square r = (Square) o;
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

    /** toString. */
    public String toString() {
        double fixedWidth = (double) Math.round(getWidth() * 10.0) / 10;
        return "Square[topLeft=" + topLeft.toString()
                + ",side=" + fixedWidth
                + ",color=" + getColor() + ",filled=" + isFilled() + "]";
    }
}
import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /** Hàm khởi tạo 2 tham số. */

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /** Hàm getPointX. */

    public double getPointX() {
        return this.pointX;
    }

    /** Hàm setPointX. */

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /** Hàm getPointY. */

    public double getPointY() {
        return this.pointY;
    }

    /** Hàm setPointY. */

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /** Hàm tính khoảng cách giữa 2 điểm. */

    public double distance(Point newPoint) {
        return Math.sqrt(Math.pow(newPoint.getPointX() - this.pointX, 2)
                + Math.pow(newPoint.getPointY() - this.pointY, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point p = (Point) o;
            if ((Double.compare(this.pointX, p.getPointX()) == 0)
                    && (Double.compare(this.pointY, p.getPointY()) == 0)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = Objects.hash(pointX, pointY);
        return hash;
    }

    /** toString. */

    public String toString() {
        double fixedX = (double) Math.round(pointX * 10.0) / 10;
        double fixedY = (double) Math.round(pointY * 10.0) / 10;
        return "(" + fixedX + "," + fixedY + ")";
    }

}

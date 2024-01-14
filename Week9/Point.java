public class Point {
    private double pointX;
    private double pointY;

    /**
     * Hàm khởi tạo 2 tham số.
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return this.pointX;
    }

    public double getPointY() {
        return this.pointY;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Hàm tính khoảng cách.
     */
    public double distance(Point other) {
        double ans = Math.sqrt(Math.pow(this.pointX - other.getPointX(), 2)
                + Math.pow(this.pointY - other.getPointY(), 2));
        return ans;
    }
}

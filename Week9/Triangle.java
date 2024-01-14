public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Hàm khởi tạo 3 tham số.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1 != null && p2 != null && p3 != null) {
            double dis1 = p1.distance(p2);
            double dis2 = p1.distance(p3);
            double dis3 = p2.distance(p3);
            if (dis1 == 0 || dis2 == 0 || dis3 == 0 || check(p1, p2, p3)) {
                throw new RuntimeException();
            } else {
                this.p1 = p1;
                this.p2 = p2;
                this.p3 = p3;
            }
        }
    }

    /**
     * Hàm kiểm tra.
     */
    public boolean check(Point p1, Point p2, Point p3) {
        if (p1 != null && p2 != null && p3 != null) {
            if (((p3.getPointX() - p1.getPointX())
                    * (p2.getPointY() - p1.getPointY())) == (p2.getPointX() - p1.getPointX())
                            * (p3.getPointY() - p1.getPointY())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public Point getP3() {
        return this.p3;
    }

    /**
     * Hàm tính diện tích.
     */
    @Override
    public double getArea() {
        double area = Math.abs(((this.p1.getPointX() * (this.p2.getPointY() - this.p3.getPointY()))
                + (this.p2.getPointX() * (this.p3.getPointY() - this.p1.getPointY()))
                + (this.p3.getPointX() * (this.p1.getPointY() - this.p2.getPointY())))) / 2;
        return area;
    }

    /**
     * Hàm tính chu vi.
     */
    @Override
    public double getPerimeter() {
        double c1 = this.p1.distance(p2);
        double c2 = this.p1.distance(p3);
        double c3 = this.p2.distance(p3);
        return (c1 + c2 + c3);
    }

    /**
     * Hàm getInfo.
     */
    @Override
    public String getInfo() {
        return "Triangle["
                + "(" + String.format("%.2f", this.p1.getPointX()) + ","
                + String.format("%.2f", this.p1.getPointY())
                + "),"
                + "(" + String.format("%.2f", this.p2.getPointX()) + ","
                + String.format("%.2f", this.p2.getPointY())
                + "),"
                + "(" + String.format("%.2f", this.p3.getPointX()) + ","
                + String.format("%.2f", this.p3.getPointY())
                + ")"
                + "]";
    }
}

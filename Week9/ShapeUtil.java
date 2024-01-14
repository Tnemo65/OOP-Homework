import java.util.List;

public class ShapeUtil {
    /**
     * Hàm printInfo.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String ans = "";
        String circles = "Circle:" + "\n";
        String triangles = "Triangle:" + "\n";
        for (GeometricObject shape : shapes) {
            if (shape != null) {
                if (shape instanceof Circle) {
                    circles = circles + shape.getInfo() + "\n";
                } else {
                    triangles = triangles + shape.getInfo() + "\n";
                }
            }
        }
        if (circles.contains("Circle:")) {
            ans += circles;
        }
        if (triangles.contains("Triangle:")) {
            ans += triangles + "\n";
        }
        return ans;
    }
}

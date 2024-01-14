import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    /** Hàm thêm hình vào list. */

    public void addShape(Shape shape) {
        if (shape != null) {
            shapes.add(shape);
        }
    }

    /** Hàm xóa hình tròn. */

    public void removeCircles() {
        List<Shape> temp = new ArrayList<>();

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                temp.add(shape);
            }
        }
        shapes.removeAll(temp);
    }

    /** Hàm getInfo. */

    public String getInfo() {
        String ans = "Layer of crazy shapes:";
        for (int i = 0; i < shapes.size(); i++) {
            ans += "\n" + shapes.get(i).toString();
        }
        return ans;
    }

    /** Hàm xóa nhiều phần tử trùng lặp. */

    public void removeDuplicates() {
        ArrayList<Shape> unique = new ArrayList<>();
        for (Shape shape : shapes) {
            if (unique.contains(shape) == false) {
                unique.add(shape);
            }
        }
        shapes.clear();
        shapes.addAll(unique);
    }

}

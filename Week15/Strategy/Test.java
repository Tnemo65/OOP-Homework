import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(List.of(8, 1, 3, 4, 9, 2, 1, 8));
    List<Integer> list2 = new ArrayList<>(List.of(8, 1, 3, 4, 9, 2, 1, 8));

    Context context = new Context(new SelectionSort());
    context.sortStrategy(list);
    System.out.println(list);

    Context context2 = new Context(new BubbleSort());
    context2.sortStrategy(list2);
    System.out.println(list2);
  }
}

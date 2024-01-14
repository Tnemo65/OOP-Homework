import java.util.List;
import java.util.stream.IntStream;

public class SelectionSort implements Strategy {

  @Override
  public void sort(List<Integer> list) {
    System.out.print("Selection Sort: ");

    int size = list.size();
    IntStream
      .range(0, size - 1)
      .forEach(i -> {
        int minIndex = i;

        for (int j = i + 1; j < size; j++) {
          if (list.get(j) < list.get(minIndex)) {
            minIndex = j;
          }
        }

        if (minIndex != i) {
          int temp = list.get(i);
          list.set(i, list.get(minIndex));
          list.set(minIndex, temp);
        }
      });
  }
}

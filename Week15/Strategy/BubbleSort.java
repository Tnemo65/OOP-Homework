import java.util.List;

public class BubbleSort implements Strategy {

  @Override
  public void sort(List<Integer> list) {
    System.out.print("Bubble Sort: ");
    
    int size = list.size();
    boolean swapped;
    
    do {
      swapped = false;
      
      for (int i = 0; i < size - 1; i++) {
        if (list.get(i) > list.get(i + 1)) {
          int temp = list.get(i);
          list.set(i, list.get(i + 1));
          list.set(i + 1, temp);
          swapped = true;
        }
      }
      
      size--;
    } while (swapped);
  }
}
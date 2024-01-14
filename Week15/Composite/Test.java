import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    Person ldt = new Person("LeDacThinh", "06/05/2004", "Ha Noi", "Male", "HT");
    Person con1 = new Person("Minh", "07/08/2023", "Ha Noi", "Male", null);
    Person con2 = new Person("Khoi", "08/09/2022", "Ha Noi", "Male", "A1");

    Person chau1 = new Person("Tuan", "06/11/2043", "Ha Noi", "Male", "B1");
    Person chau2 = new Person("Ha", "06/11/2044", "Ha Noi", "Female", "B2");
    Person chau3 = new Person("Hai", "06/11/2056", "Ha Noi", "Male", null);

    Person chat1 = new Person("Trung", "06/11/2070", "Ha Noi", "Male", null);
    Person chat2 = new Person("Quang", "06/11/2075", "Ha Noi", "Female", null);
    Person chat3 = new Person("Dat", "06/11/2078", "Ha Noi", "Female", "Lan");

    /*
    ldt   -   HT
    /           \
    Minh        Khoi    -    A1
    /         |    |  \
    B1 - Tuan  B2 - Ha    Hai  Hau
    /   \        |
    Trung   Quang     Dat - Lan
    */

    List<Person> listPerson = new ArrayList<>();
    listPerson.add(ldt);

    ldt.addChild(con1);
    ldt.addChild(con2);

    con2.addChild(chau1);
    con2.addChild(chau2);
    con2.addChild(chau3);

    chau1.addChild(chat1);
    chau1.addChild(chat2);
    chau1.addChild(chat3);

    List<Person> listPersonNotMarried = new ArrayList<>();

    List<String> listFamilyHasTwoChildren = new ArrayList<>();

    List<Person> listPersonOfTheLastGeneration = new ArrayList<>();

    while (!listPerson.isEmpty()) {
      int size = listPerson.size();
      boolean hasChildren = false;

      for (int i = 0; i < size; i++) {
        Person person = listPerson.get(i);
        int numChildren = (person.getMarried() == null)
          ? -1
          : person.getChildren().size();

        if (numChildren == -1) {
          listPersonNotMarried.add(person);
        } else if (numChildren > 0) {
          hasChildren = true;
          listPerson.addAll(person.getChildren());

          if (numChildren == 2) {
            listFamilyHasTwoChildren.add(
              person.getName() + " - " + person.getMarried()
            );
          }
        }
      }

      if (!hasChildren) {
        listPersonOfTheLastGeneration.addAll(listPerson);
        listPerson.clear();
      } else {
        List<Person> nextListPerson = new ArrayList<>();

        for (int i = 0; i < size; i++) {
          if (listPerson.get(i).getChildren().size() > 0) {
            nextListPerson.addAll(listPerson.get(i).getChildren());
          }
        }

        listPerson.clear();
        listPerson.addAll(nextListPerson);
      }
    }

    System.out.println("Chua ket hon: ");
    for (Person person : listPersonNotMarried) {
      System.out.println("\t" + person);
    }

    System.out.println("\nCo 2 con:");
    for (String family : listFamilyHasTwoChildren) {
      System.out.println("\t" + family);
    }

    System.out.println("\nThe he moi nhat:");
    for (Person person : listPersonOfTheLastGeneration) {
      System.out.println("\t" + person);
    }
  }
}

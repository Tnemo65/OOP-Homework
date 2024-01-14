import java.util.ArrayList;
import java.util.List;

public class Person {

  private final String name;
  private final String birthDate;
  private final String address;
  private final String sex;
  private final String married;
  private final List<Person> children;

  public Person(
    String name,
    String birthDate,
    String address,
    String sex,
    String married
  ) {
    this.name = name;
    this.birthDate = birthDate;
    this.sex = sex;
    this.address = address;
    this.married = married;
    this.children = new ArrayList<>();
  }

  public void addChild(Person child) {
    children.add(child);
  }

  public String getAddress() {
    return this.address;
  }

  public String getName() {
    return this.name;
  }

  public String getMarried() {
    return this.married;
  }

  public List<Person> getChildren() {
    return this.children;
  }

  public String toString() {
    return (
      "Name: " +
      this.name +
      ", Date of birth: " +
      this.birthDate +
      " Address: " +
      this.address +
      ", Sex: " +
      this.sex
    );
  }
}

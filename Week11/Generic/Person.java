public class Person implements Comparable<Person> {
    protected String name;
    protected String address;
    protected int age;

    public Person() {

    }

    /**
     * Person.
     */
    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Hàm compare 2 đối tượng Person.
     */
    public int compareTo(Person p) {
        int ans = 0;
        if (this.equals(p)) {
            ans = Integer.compare(this.getAge(), p.getAge());
        } else {
            ans = this.getName().compareTo(p.getName());
        }
        return ans;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person temp = (Person) o;
            if (this.getName().equals(temp.getName())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

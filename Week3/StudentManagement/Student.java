public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Ham khoi tao mac dinh.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Ham khoi tao co tham so.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * Khoi tao voi tham so la mot bien Student.
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
    }

    /**
     * Ham set name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Ham set id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Ham set group.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Ham set email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Ham get name.
     */
    public String getName() {
        return name;
    }

    /**
     * Ham get id.
     */
    public String getId() {
        return id;
    }

    /**
     * Ham get group.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Ham get email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Ham get Info day du thong tin name id group email.
     */
    public String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}
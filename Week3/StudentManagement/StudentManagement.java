import java.util.Objects;

public class StudentManagement {
    private Student[] students;
    private int count;
    private int groupCount;
    private String[] groupList;

    /**
     * Ham khoi tao mac dinh.
     */
    public StudentManagement() {
        students = new Student[100];
        count = 0;
        groupCount = 0;
        groupList = new String[100];
    }

    /**
     * Ham kiem tra xem 2 doi tuong Student co cung group.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Ham them Student vao mang.
     */
    public void addStudent(Student newStudent) {
        if (count < 100) {
            students[count] = newStudent;
            count++;
        }
    }

    /**
     * Ham kiem tra xem trong mang group co group dang kiem tra chua.
     */
    public boolean checkGroupExist(String[] groupList, String group) {
        for (String s : groupList) {
            if (s != null && s.equals(group)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Ham nhom cac Student vao 1 nhom.
     */
    public String studentsByGroup() {
        String ans = "";
        boolean[] check = new boolean[count];

        for (int i = 0; i < count; i++) {
            if (checkGroupExist(groupList, students[i].getGroup()) == false) {
                groupList[groupCount] = students[i].getGroup();
                groupCount++;
            }
        }
        for (int i = 0; i < count; i++) {
            check[i] = false;
        }
        for (int i = 0; i < groupCount; i++) {
            ans = ans + groupList[i] + "\n";
            for (int j = 0; j < count; j++) {
                if (groupList[i].equals(students[j].getGroup())) {
                    if (!check[j]) {
                        ans = ans + students[j].getInfo() + "\n";
                        check[j] = true;
                    }
                }
            }
        }
        return ans;
    }

    /**
     * Ham xoa Student.
     */
    public void removeStudent(String id) {
        if (count == 0) {
            return;
        }

        int index = 0;

        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                index = i;
            }
        }
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        students[count] = null;
        count--;
    }
}

package chapter5.T8;

/**
 * Created by kun36 on 2016/12/16.
 */
public class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void fuck() {
        System.out.println(name + ": Nothing to fuck!");
    }

    void fuck(Student stu) {
        System.out.println(name + " fuck " + stu.name);
    }

    void with(Student stu) {
        fuck();
        fuck(stu);
    }

    public static void main(String[] args) {
        new Student("A").with(new Student("B"));
    }
}

package chapter6.T1.hehe;

/**
 * Created by kun36 on 2016/12/18.
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

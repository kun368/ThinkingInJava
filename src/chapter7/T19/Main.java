package chapter7.T19;

/**
 * Created by kun36 on 2016/12/24.
 */

class Student {

    final String name;

    public Student() {
        this.name = "";
    }

    public Student(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("abc");
//        student.name = "123";
        System.out.println(student.name);
    }
}

package chapter5.T18;

/**
 * Created by kun36 on 2016/12/16.
 */
class Student {
    String name;

    public Student(String name) {
        this.name = name;
        System.out.println("ok...");
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] stus = {new Student("a"), new Student("b")};
    }
}

package chapter6.T6;

/**
 * Created by kun36 on 2016/12/18.
 */

class Student {
    protected int age;
}

public class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.age = 10;
        System.out.println(stu.age);
    }
}

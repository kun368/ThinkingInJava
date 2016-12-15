package chapter3.T2;

/**
 * Created by kun36 on 2016/12/14.
 */

class Student {
    float f1;
    Float f2;

    @Override
    public String toString() {
        return "Student{" +
                "f1=" + f1 +
                ", f2=" + f2 +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s2.f1 = 2.1f;
        s2.f2 = 2.2f;
        s1 = s2;
        System.out.println(s1);
        System.out.println(s2);
    }
}

package chapter3.T3;

import java.util.Random;

/**
 * Created by kun36 on 2016/12/14.
 */

class Student {
    double score;
}

public class Main {

    static void change(Student stu) {
        stu.score += 10;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.score = 10;
        change(student);
        System.out.println(student.score);
    }
}

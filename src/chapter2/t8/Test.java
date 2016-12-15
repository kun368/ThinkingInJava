package chapter2.t8;

/**
 * Created by kun on 16-12-12.
 */
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        Student stu4 = new Student();
        stu1.stuCount++;
        stu2.stuCount++;
        stu3.stuCount++;
        stu4.stuCount++;
        System.out.println(Student.stuCount);
    }
}

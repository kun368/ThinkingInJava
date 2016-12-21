package chapter7.T1;

/**
 * Created by kun36 on 2016/12/20.
 */

class Student {

    private String s;

    public String getS() {
        if(s == null)
            s = "abc";
        return s;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s='" + getS() + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu);
    }
}

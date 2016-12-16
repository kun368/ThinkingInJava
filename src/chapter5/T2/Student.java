package chapter5.T2;

/**
 * Created by kun36 on 2016/12/16.
 */
public class Student {
    String str1 = "abc";
    String str2;

    public Student(String str2) {
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                '}';
    }
}

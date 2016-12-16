package chapter5.T9;

/**
 * Created by kun36 on 2016/12/16.
 */
public class Student {

    String username;
    String password;

    Student(String username) {
        this.username = username;
    }

    Student(String username, String password) {
        this(username);
        this.password = password;
    }

    public static void main(String[] args) {
        new Student("A", "B");
    }


}

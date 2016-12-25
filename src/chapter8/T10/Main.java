package chapter8.T10;

/**
 * Created by kun36 on 2016/12/25.
 */

class People {

    void talk() {
        System.out.println("I'm " + name());
    }

    String name() {
        return "a people";
    }
}

class Student extends People {
    @Override
    String name() {
        return "a student";
    }
}

public class Main {
    public static void main(String[] args) {
        People people = new Student();
        people.talk();
    }
}

package chapter7.T13;

import java.math.BigInteger;

/**
 * Created by kun36 on 2016/12/22.
 */

class People {
    void talk(int i) {
        System.out.println("1#: " + i);
    }
    void talk(char x) {
        System.out.println("2#: " + x);
    }
    void talk(long t) {
        System.out.println("3#: " + t);
    }
}

class Student extends People {
    void talk(BigInteger t) {
        System.out.println("4#: " + t);
    }
}

public class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.talk(1);
        stu.talk('1');
        stu.talk(1L);
        stu.talk(BigInteger.ONE);
    }
}

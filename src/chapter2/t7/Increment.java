package chapter2.t7;

/**
 * Created by kun on 16-12-12.
 */
public class Increment {

    static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        increment();
        increment();
        System.out.println(StaticTest.i);
    }
}

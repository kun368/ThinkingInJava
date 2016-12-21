package chapter7.T8;

/**
 * Created by kun36 on 2016/12/21.
 */

class A {
    A() {
        System.out.println("A()");
    }
}
class B extends A {
    B() {
        System.out.println("B()");
    }
    B(int i) {
        System.out.println("B(int i)");
    }
}

public class Main {
    public static void main(String[] args) {
        new B(0);
        System.out.println();
        new B();
    }
}

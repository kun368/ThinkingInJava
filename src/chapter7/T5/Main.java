package chapter7.T5;

/**
 * Created by kun36 on 2016/12/21.
 */

class A {
    A() {
        System.out.println("A()");
    }
}

class B {
    B() {
        System.out.println("B()");
    }
}

class C extends A {

    B b;

    C() {
        System.out.println("C()");
    }
}

public class Main {
    public static void main(String[] args) {
        new C();
    }
}

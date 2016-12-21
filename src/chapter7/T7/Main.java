package chapter7.T7;

/**
 * Created by kun36 on 2016/12/21.
 */

class A {
    A(int i) {
        System.out.println("A()");
    }
}

class B {
    B(int i) {
        System.out.println("B()");
    }
}

class C extends A {

    B b;

    C() {
        super(10);
        System.out.println("C()");
    }
}

public class Main {
    public static void main(String[] args) {
        new C();
    }
}

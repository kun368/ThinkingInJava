package chapter7.T21;

/**
 * Created by kun36 on 2016/12/24.
 */
class A {
    public final void talk() {
        System.out.println("A.talk");
    }
}

class B extends A {
//    public void talk() {
//        System.out.println("B.talk");
//    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.talk();
    }
}

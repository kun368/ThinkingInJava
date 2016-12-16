package chapter5.T13;

/**
 * Created by kun36 on 2016/12/16.
 */

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static {
        cup2 = new Cup(2);
    }
    static Cup cup1 = new Cup(1);
    static Cup cup2;

    public Cups() {
        System.out.println("Cups");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        Cups.cup1.f(1000);
    }
}

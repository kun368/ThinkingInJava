package chapter7.T24;

/**
 * Created by kun36 on 2016/12/24.
 */

class Insect {
    private int i = 9;
    protected int j;

    public Insect() {
        System.out.println("i=" + i + " j=" + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect init....");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {

    private int k = printInit("Beetle init...");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle init...");


}

class MyBeetle extends Beetle {
    private int l = printInit("MyBeetle init...");

    MyBeetle() {
        System.out.println("l = " + l);
    }

    private static int x3 = printInit("static MyBeetle init...");

    public static void main(String[] args) {
        MyBeetle b = new MyBeetle();
    }
}

public class Main {

}

package chapter7.T18;

/**
 * Created by kun36 on 2016/12/24.
 */

class Hehe {
    static final double a = Math.random();
    final double b = Math.random();
}

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {
            Hehe he = new Hehe();
            System.out.println(he.a + " " + he.b);
        }
    }
}

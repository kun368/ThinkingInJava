package chapter7.T23;

/**
 * Created by kun36 on 2016/12/24.
 */

class Hehe {
    public static int he() {
        System.out.println("Hehe.he");
        return 10;
    }
}

public class Main {

    private static int x = Hehe.he();

    public static void main(String[] args) {
        System.out.println("Main.main");
    }
}
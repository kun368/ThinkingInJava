package chapter7.T10;

/**
 * Created by kun36 on 2016/12/21.
 */

class Compoent1 {
    Compoent1(int i) {
        System.out.println("Compoent1(" + i + ")");
    }
}
class Compoent2 {
    Compoent2(int i) {
        System.out.println("Compoent2(" + i + ")");
    }
}
class Compoent3 {
    Compoent3(int i) {
        System.out.println("Compoent3(" + i + ")");
    }
}

class Root {

    Compoent1 compoent1 = new Compoent1(1);
    Compoent2 compoent2 = new Compoent2(2);
    Compoent3 compoent3 = new Compoent3(3);

    public Root(int i) {
        System.out.println("Root(" + i + ")");
    }
}


class Stem extends Root {

    Compoent1 compoent1 = new Compoent1(4);
    Compoent2 compoent2 = new Compoent2(5);
    Compoent3 compoent3 = new Compoent3(6);

    public Stem(int i) {
        super(10);
        System.out.println("Stem(" + i + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        new Stem(100);
    }
}

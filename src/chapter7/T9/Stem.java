package chapter7.T9;

/**
 * Created by kun36 on 2016/12/21.
 */

class Compoent1 {
    Compoent1() {
        System.out.println("Compoent1()");
    }
}
class Compoent2 {
    Compoent2() {
        System.out.println("Compoent2()");
    }
}
class Compoent3 {
    Compoent3() {
        System.out.println("Compoent3()");
    }
}

class Root {

    Compoent1 compoent1 = new Compoent1();
    Compoent2 compoent2 = new Compoent2();
    Compoent3 compoent3 = new Compoent3();

    public Root() {
        System.out.println("Root()");
    }
}


public class Stem extends Root {

    Compoent1 compoent1 = new Compoent1();
    Compoent2 compoent2 = new Compoent2();
    Compoent3 compoent3 = new Compoent3();

    public Stem() {
        System.out.println("Stem()");
    }

    public static void main(String[] args) {
        new Stem();
    }
}

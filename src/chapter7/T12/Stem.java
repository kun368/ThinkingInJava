package chapter7.T12;

class Compoent1 {
    Compoent1() {
        System.out.println("Compoent1()");
    }
    void dispose() {
        System.out.println("Compoent1.dispose()");
    }
}
class Compoent2 {
    Compoent2() {
        System.out.println("Compoent2()");
    }
    void dispose() {
        System.out.println("Compoent2.dispose()");
    }
}
class Compoent3 {
    Compoent3() {
        System.out.println("Compoent3()");
    }
    void dispose() {
        System.out.println("Compoent3.dispose()");
    }
}

class Root {

    Compoent1 compoent1 = new Compoent1();
    Compoent2 compoent2 = new Compoent2();
    Compoent3 compoent3 = new Compoent3();

    public Root() {
        System.out.println("Root()");
    }
    void dispose() {
        compoent1.dispose();
        compoent2.dispose();
        compoent3.dispose();
        System.out.println("Root.dispose()");
    }
}


public class Stem extends Root {

    Compoent1 compoent1 = new Compoent1();
    Compoent2 compoent2 = new Compoent2();
    Compoent3 compoent3 = new Compoent3();

    public Stem() {
        System.out.println("Stem()");
    }

    void dispose() {
        super.dispose();
        compoent1.dispose();
        compoent2.dispose();
        compoent3.dispose();
        System.out.println("Stem.dispose()");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
        stem.dispose();
    }
}

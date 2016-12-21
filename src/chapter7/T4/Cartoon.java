package chapter7.T4;

class Art {
    Art() {
        System.out.println("Art()");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing()");
    }
}

public class Cartoon extends Drawing {

    Cartoon() {
        System.out.println("Cartoon()");
    }

    public static void main(String[] args) {
        new Cartoon();
    }
}

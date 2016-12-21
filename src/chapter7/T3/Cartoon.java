package chapter7.T3;

/**
 * Created by kun36 on 2016/12/21.
 */

class Art {
    Art() {
        System.out.println("Art()");
    }
}

class Drawing extends Art {
    Drawing() {
        super();
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

package chapter7.T17;

/**
 * Created by kun36 on 2016/12/22.
 */
public class Forg extends Amphibian {

    @Override
    void fuck2() {
        System.out.println("Forg.fuck2");
    }

    public static void main(String[] args) {
        Amphibian a = new Forg();
        a.fuck1();
        a.fuck2();
    }
}

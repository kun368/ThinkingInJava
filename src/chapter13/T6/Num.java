package chapter13.T6;

/**
 * Created by kun36 on 2016/12/28.
 */
public class Num {

    int a;
    long b;
    float c;
    double d;

    public Num(int a, long b, float c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("%d %d %f %f", a, b, c, d);
    }

    public static void main(String[] args) {
        System.out.println(new Num(1, 2, 3, 4));
    }
}

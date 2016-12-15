package chapter4.T5;

/**
 * Created by kun36 on 2016/12/15.
 */
public class Main {

    static void out(int x) {
        for(int i = 31; i >= 0; --i)
            System.out.print((x & (1 << i)) != 0 ? '1' : '0');
        System.out.println();
    }

    public static void main(String[] args) {
        int a = 0xAAAAAAAA;
        int b = 0x55555555;

        out(a);
        out(b);
        out(a | b);
        out(a & b);
        out(a ^ b);
    }
}

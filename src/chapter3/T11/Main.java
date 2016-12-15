package chapter3.T11;

/**
 * Created by kun36 on 2016/12/15.
 */
public class Main {
    public static void main(String[] args) {
        int a = 0x80000000;
        System.out.println(Integer.toBinaryString(a));
        for(int i = 0; i < 31; ++i) {
            a >>= 1;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}

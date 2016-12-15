package chapter3.T10;

/**
 * Created by kun36 on 2016/12/15.
 */
public class Main {
    public static void main(String[] args) {
        int a = 0xAAAAAAAA;
        int b = 0x55555555;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a ^ b));
    }
}

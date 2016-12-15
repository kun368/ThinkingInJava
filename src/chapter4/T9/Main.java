package chapter4.T9;

/**
 * Created by kun36 on 2016/12/15.
 */
public class Main {

    static void fib(int n) {
        int x = 1, y = 1;
        for(int i = 0; i < n; ++i) {
            System.out.print(x + " ");
            int z = x + y;
            x = y; y = z;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        fib(5);
        fib(16);
    }
}

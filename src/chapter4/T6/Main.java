package chapter4.T6;

/**
 * Created by kun36 on 2016/12/15.
 */
public class Main {

    static boolean test(int testval, int begin, int end) {
        return testval >= begin && testval <= end;
    }

    public static void main(String[] args) {
        System.out.println(test(1, 0, 2));
        System.out.println(test(-1, 0, 2));
    }
}

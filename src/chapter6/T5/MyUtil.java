package chapter6.T5;

/**
 * Created by kun36 on 2016/12/18.
 */
public class MyUtil {
    public static int len1(int x) {
        return Integer.toString(x).length();
    }
    protected static int len2(int x) {
        return Integer.toString(x).length();
    }
    static int len3(int x) {
        return Integer.toString(x).length();
    }
    private static int len4(int x) {
        return Integer.toString(x).length();
    }
}

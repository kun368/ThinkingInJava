package chapter5.T19;

/**
 * Created by kun36 on 2016/12/16.
 */
public class Main {

    static void test(String... strs) {
        for (String str : strs) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        test(new String[]{"sa", "fds"});
        test("sa", "fds");
    }
}

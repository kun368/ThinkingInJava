package chapter3.T14;

/**
 * Created by kun36 on 2016/12/15.
 */
public class Main {

    static void f(String a, String b) {
        System.out.println("a == b : " + (a==b));
        System.out.println("a equals b " + (a.equals(b)));
    }

    public static void main(String[] args) {
        f("a", "a");
        f("abcfdsfsdafdsafdsafdsafdsafdsa", "abcfdsfsdafdsafdsafdsafdsafdsa");
        String y = "rerewqrewqrwfdsfdsfvcxz1";
        f("rerewqr" + "ewqrwfdsfdsfvcxz1", y);
    }
}

package chapter13.T9;

/**
 * Created by kun36 on 2016/12/30.
 */
public class Main {

    public static final String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void main(String[] args) {
        System.out.println(knights.replaceAll("a|e|i|o|u|A|E|I|O|U", "_"));
    }
}

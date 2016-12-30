package chapter13.T8;

import java.util.Arrays;

/**
 * Created by kun36 on 2016/12/30.
 */
public class Main {

    public static final String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void main(String[] args) {
        System.out.println(Arrays.toString(knights.split("the|you")));
    }
}

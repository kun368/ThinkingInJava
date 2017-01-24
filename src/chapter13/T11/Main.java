package chapter13.T11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kun36 on 2016/12/30.
 */
public class Main {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher matcher = pat.matcher("Arline ate eight apples and one orange while Anita hadn't any");
        System.out.println(matcher.find());
    }
}

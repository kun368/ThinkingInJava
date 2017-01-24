package chapter13.T10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kun36 on 2016/12/30.
 */
public class Main {

    static boolean judge(String s, Pattern pat) {
        Matcher matcher = pat.matcher(s);
        return matcher.find();
    }

    public static void main(String[] args) {
        final String s = "Java now has regular expressions";

        System.out.println(judge(s, Pattern.compile("^Java")));
        System.out.println(judge(s, Pattern.compile("\\Breg.*")));
        System.out.println(judge(s, Pattern.compile("n.w\\s+h(a|i)s")));

        System.out.println(judge(s, Pattern.compile("s?")));
        System.out.println(judge(s, Pattern.compile("s*")));
        System.out.println(judge(s, Pattern.compile("s+")));

        System.out.println(judge(s, Pattern.compile("s{4}")));
        System.out.println(judge(s, Pattern.compile("s{1}")));
        System.out.println(judge(s, Pattern.compile("s{0,3}")));
    }
}

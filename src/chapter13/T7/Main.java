package chapter13.T7;

import java.util.regex.Pattern;


public class Main {

    static final Pattern pat = Pattern.compile("^[A-Z].*\\.$");

    static boolean judge(String x) {
        return pat.matcher(x).matches();
    }

    public static void main(String[] args) {
        System.out.println(judge("A."));
        System.out.println(judge("Abc."));
        System.out.println(judge("Aaaa."));
        System.out.println(judge("A"));
        System.out.println(judge("."));
    }
}

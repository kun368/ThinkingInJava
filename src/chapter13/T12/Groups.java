package chapter13.T12;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kun36 on 2016/12/30.
 */
public class Groups {

    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Matcher m = Pattern.compile("\\b[a-z]+\\b").matcher(POEM);
        while(m.find()) {
            set.add(m.group());
        }
        System.out.println(set.size());
        System.out.println(set);
    }
}

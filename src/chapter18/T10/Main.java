package chapter18.T10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.regex.Pattern;

/**
 * Created by kun36 on 2017/1/26.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = args.length >= 1 ? args[0] : "ThinkingInJava.iml";
        String regex = args.length >= 2 ? args[1] : ".*";
        Pattern pattern = Pattern.compile(regex);

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = null;
        LinkedList<String> stack = new LinkedList<>();
        while((line = reader.readLine()) != null) {
            if(pattern.matcher(line).matches())
                stack.addLast(line);
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pollLast());
        }
    }
}

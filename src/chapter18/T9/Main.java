package chapter18.T9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

/**
 * Created by kun36 on 2017/1/26.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "ThinkingInJava.iml";
        if(args.length >= 1) {
            fileName = args[0];
        }
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = null;
        LinkedList<String> stack = new LinkedList<>();
        while((line = reader.readLine()) != null) {
            stack.addLast(line);
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pollLast().toUpperCase());
        }
    }
}

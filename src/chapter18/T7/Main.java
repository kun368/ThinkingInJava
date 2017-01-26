package chapter18.T7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("ThinkingInJava.iml"));
        String line = null;
        LinkedList<String> stack = new LinkedList<>();
        while((line = reader.readLine()) != null) {
            stack.addLast(line);
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pollLast());
        }
    }
}

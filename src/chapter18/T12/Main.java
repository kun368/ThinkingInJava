package chapter18.T12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.LinkedList;

/**
 * Created by kun36 on 2017/1/26.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = args.length >= 1 ? args[0] : "ThinkingInJava.iml";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = null;
        LinkedList<String> stack = new LinkedList<>();
        while((line = reader.readLine()) != null) {
            stack.addLast(line);
        }

        PrintWriter writer = new PrintWriter(fileName + ".tmp");
        int cnt = 0;
        while(!stack.isEmpty()) {
            writer.printf("%5d %s\n", ++cnt, stack.pollLast());
        }
        writer.close();
        reader.close();
    }
}

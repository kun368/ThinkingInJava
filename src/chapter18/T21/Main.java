package chapter18.T21;

import java.io.*;

/**
 * Created by kun36 on 2017/1/26.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out), true);
        String line;
        while((line = reader.readLine()) != null) {
            writer.println(line);
        }
    }
}

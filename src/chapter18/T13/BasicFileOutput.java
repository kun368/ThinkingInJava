package chapter18.T13;//: io/BasicFileOutput.java

import java.io.*;

public class BasicFileOutput {
    static String file = "BasicFileOutput.out";

    public static void main(String[] args)
            throws IOException {
        LineNumberReader in = new LineNumberReader(
                new BufferedReader(
                    new StringReader(
                        BufferedInputFile.read("BasicFileOutput.java"))));
        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file)));
        String s;
        while ((s = in.readLine()) != null)
            out.println(in.getLineNumber() + ": " + s);
        out.close();
        // Show the stored file:
        System.out.println(BufferedInputFile.read(file));
    }
} /* (Execute to see output) *///:~

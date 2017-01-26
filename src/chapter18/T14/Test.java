package chapter18.T14;

import java.io.*;
import java.util.Random;

/**
 * Created by kun36 on 2017/1/26.
 */
public class Test {

    public static void test1(File file, long[] arr) throws IOException {
        long l1 = System.currentTimeMillis();
        PrintWriter writer = new PrintWriter(new FileWriter(file));
        for (long l : arr)
            writer.print(Long.toBinaryString(l));
        writer.close();
        System.out.println(System.currentTimeMillis() - l1);
    }

    public static void test2(File file, long[] arr) throws IOException {
        long l1 = System.currentTimeMillis();
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file), 8192 * 16));
        for (long l : arr)
            writer.print(Long.toBinaryString(l));
        writer.close();
        System.out.println(System.currentTimeMillis() - l1);
    }

    public static void main(String[] args) throws Exception {
        long[] arr = new long[50240000];
        Random random = new Random();
        for(int i = 0; i < arr.length; ++i)
            arr[i] = random.nextLong();
        test1(new File("a.tmp"), arr);
        test2(new File("b.tmp"), arr);
    }
}

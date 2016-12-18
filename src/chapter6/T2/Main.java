package chapter6.T2;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("123");
        vector.add("456");
        System.out.println(vector);

        chapter6.T2.Vector vector1 = new chapter6.T2.Vector("hehe");
        System.out.println(vector1);
    }
}

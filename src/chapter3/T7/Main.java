package chapter3.T7;

import java.util.Random;

/**
 * Created by kun36 on 2016/12/14.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i < 100; ++i) {
            System.out.println(random.nextBoolean() ? "正" : "反");
        }
    }
}

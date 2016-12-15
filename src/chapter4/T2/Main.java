package chapter4.T2;

import java.util.Random;

/**
 * Created by kun36 on 2016/12/15.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        for(int i = 0; i < 25; ++i) {
            int y = random.nextInt();
            if(x < y) System.out.println(x + " < " + y);
            else if(x == y) System.out.println(x + " = " + y);
            else System.out.println(x + " > " + y);
            x = y;
        }
    }
}

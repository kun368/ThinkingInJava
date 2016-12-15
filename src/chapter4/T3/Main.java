package chapter4.T3;

import java.util.Random;

/**
 * Created by kun36 on 2016/12/15.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        while(true) {
            int y = random.nextInt();
            if(x < y) System.out.println(x + " < " + y);
            else if(x == y) System.out.println(x + " = " + y);
            else System.out.println(x + " > " + y);
            x = y;
        }
    }
}

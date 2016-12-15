package chapter2.t10;

import java.util.Arrays;

/**
 * Created by kun on 16-12-12.
 */
public class Main {
    public static void main(String[] args) {
        if(args.length < 3) {
            System.out.println("参数个数不正确！");
            return;
        }
        for(int i = 0; i < 3; ++i)
            System.out.println(args[i]);
    }
}

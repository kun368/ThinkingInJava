package chapter4.T4;

/**
 * Created by kun36 on 2016/12/15.
 */
public class Main {
    public static void main(String[] args) {
        for(int i = 2; i <= 1000; ++i) {
            boolean ok = true;
            for(int j = 2, ed = (int) (Math.sqrt(i) + 1); j <= ed && j < i; ++j)
                if(i % j == 0) {
                    ok = false;
                    break;
                }
            if(ok) System.out.println(i);
        }
    }
}

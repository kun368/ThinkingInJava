package chapter4.T10;

/**
 * Created by kun36 on 2016/12/15.
 */
public class Main {

    static boolean test(int x) {
        if(x % 100 == 0)
            return false;
        int xx = x;
        int []arr = new int[4];
        for(int i = 0; i < 4; ++i) {
            arr[i] = xx % 10;
            xx /= 10;
        }
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                for(int k = 0; k < 4; ++k) {
                    if(i == j || j == k || i == k)
                        continue;
                    int t = 6 - i - j - k;
                    int A = arr[i] * 10 + arr[j];
                    int B = arr[k] * 10 + arr[t];
                    if(A * B == x)
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        for(int i = 1000; i <= 9999; ++i) {
            if(test(i))
                System.out.println(i);
        }
    }
}

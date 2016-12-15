package chapter4.T8;

/**
 * Created by kun36 on 2016/12/15.
 */
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {
            switch (i) {
                case 1:
                    System.out.println("first");
                    break;
                case 2:
                    System.out.println("second");
                    break;
                default:
                    System.out.println("NO!");
            }
        }
    }
}

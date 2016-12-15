package chapter3.T4;

/**
 * Created by kun36 on 2016/12/14.
 */
public class Main {

    static double calcSpeed(double len, double time) {
        return len / time;
    }

    public static void main(String[] args) {
        System.out.println(calcSpeed(10, 2));
    }
}

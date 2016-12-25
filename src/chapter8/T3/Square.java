package chapter8.T3;

/**
 * Created by kun36 on 2016/12/25.
 */
public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase");
    }
}

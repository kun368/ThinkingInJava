package chapter8.T3;

/**
 * Created by kun36 on 2016/12/25.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase");
    }

    @Override
    public void talk() {
        System.out.println("Circle.talk");
    }
}

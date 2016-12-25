package chapter8.T2;

/**
 * Created by kun36 on 2016/12/25.
 */
public class Main {

    private static RandomShapeGener gener = new RandomShapeGener();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; ++i)
            shapes[i] = gener.next();
        for (Shape shape : shapes)
            shape.draw();
    }
}

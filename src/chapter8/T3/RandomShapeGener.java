package chapter8.T3;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by kun36 on 2016/12/25.
 */
public class RandomShapeGener implements Iterator<Shape> {

    private Random random = new Random();


    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Shape next() {
        switch (random.nextInt(3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
        return null;
    }
}

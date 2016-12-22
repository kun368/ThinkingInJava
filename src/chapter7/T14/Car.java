package chapter7.T14;

import java.util.Arrays;

/**
 * Created by kun36 on 2016/12/22.
 */

class Engin {
    public void start() {}
    public void rev() {}
    public void stop() {}
    public void service() {
        start();
        rev();
        start();
    }
}

class Wheel {
    public void inflate(int psi) {}
}

class Window {
    public void roolup() {}
    public void rooldown() {}
}

class Door {
    public Window window = new Window();
    public void open() {}
    public void close() {}
}

public class Car {

    public Engin engin = new Engin();
    public Wheel[] wheels = new Wheel[4];
    public Door left = new Door(), right = new Door();

    public Car() {
        for (int i = 0; i < wheels.length; i++)
            wheels[i] = new Wheel();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.roolup();;
        car.wheels[0].inflate(72);
        car.engin.service();
    }
}

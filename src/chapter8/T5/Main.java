package chapter8.T5;

/**
 * Created by kun36 on 2016/12/25.
 */

abstract class Cycle {
    void run() {
        System.out.println("Cycle.run");
    }

    abstract int wheels();
}

class Unicycle extends Cycle {
    @Override
    void run() {
        System.out.println("Unicycle.run");
    }

    @Override
    int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    @Override
    void run() {
        System.out.println("Bicycle.run");
    }

    @Override
    int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    @Override
    void run() {
        System.out.println("Tricycle.run");
    }

    @Override
    int wheels() {
        return 3;
    }
}

public class Main {

    public static void ride(Cycle cycle) {
        cycle.run();
        System.out.println("Count:" + cycle.wheels());
    }


    public static void main(String[] args) {
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }

}

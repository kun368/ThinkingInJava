package chapter8.T1;

/**
 * Created by kun36 on 2016/12/25.
 */

class Cycle {
    void run() {
        System.out.println("Cycle.run");
    }
}

class Unicycle extends Cycle {
    @Override
    void run() {
        System.out.println("Unicycle.run");
    }
}

class Bicycle extends Cycle {
    @Override
    void run() {
        System.out.println("Bicycle.run");
    }
}

class Tricycle extends Cycle {
    @Override
    void run() {
        System.out.println("Tricycle.run");
    }
}

public class Main {

    public static void ride(Cycle cycle) {
        cycle.run();
    }


    public static void main(String[] args) {
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }

}

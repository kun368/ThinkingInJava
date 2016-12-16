package chapter5.T6;

/**
 * Created by kun36 on 2016/12/16.
 */
public class Dog {
    void bark() {
        System.out.println("Bark!");
    }
    void bark(int x, double y) {
        System.out.println("Barking!");
    }
    void bark(double x, int y) {
        System.out.println("Howling!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1, 1.0);
        dog.bark(1.0, 1);
    }
}

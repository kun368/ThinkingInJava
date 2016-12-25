package chapter8.T9;

/**
 * Created by kun36 on 2016/12/25.
 */

class Rodent {
    void talk() {
        System.out.println("Rodent.talk");
    }
}

class Mouse extends Rodent {
    @Override
    void talk() {
        System.out.println("Mouse.talk");
    }
}

class Gerbil extends Rodent {
    @Override
    void talk() {
        System.out.println("Gerbil.talk");
    }
}

class Hamster extends Rodent {
    @Override
    void talk() {
        System.out.println("Hamster.talk");
    }
}

public class Main {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Gerbil(), new Hamster()};
        for (Rodent rodent : rodents) {
            rodent.talk();
        }
    }
}

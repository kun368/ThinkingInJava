package chapter3.T6;

class Dog {
    String name;
    String says;
}

public class Main {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "spot";
        spot.says = "Ruff!";

        Dog scruffy = new Dog();
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";

        Dog hehe = new Dog();
        hehe = spot;
        System.out.println(hehe == spot);
        System.out.println(hehe.equals(spot));
    }
}

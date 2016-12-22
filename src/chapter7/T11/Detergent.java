package chapter7.T11;

/**
 * Created by kun36 on 2016/12/22.
 */
class Cleanser {

    private String s = "caleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute() ");
    }

    public void apply() {
        append(" apply() ");
    }

    public void scrub() {
        append(" scrub() ");
    }

    @Override
    public String toString() {
        return "Cleanser{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}

public class Detergent {

    Cleanser cleanser = new Cleanser();

    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        append(" Detergent.scrub() ");
        cleanser.scrub();
    }

    public void foam() {
        append(" foma() ");
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }

    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.dilute();
        d.apply();
        d.scrub();
        d.foam();
        System.out.println(d);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

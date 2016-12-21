package chapter7.T2;

import java.util.Calendar;

/**
 * Created by kun36 on 2016/12/21.
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

class Detergent extends Cleanser {

    @Override
    public void scrub() {
        append(" Detergent.scrub() ");
        super.scrub();
    }

    public void foam() {
        append(" foma() ");
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

class MyDetergent extends Detergent {

    @Override
    public void scrub() {
        append(" MyDetergent.scrub() ");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize() ");
    }

    public static void main(String[] args) {
        MyDetergent m = new MyDetergent();
        m.dilute();
        m.apply();
        m.scrub();
        m.foam();
        m.sterilize();
        System.out.println(m);
    }
}

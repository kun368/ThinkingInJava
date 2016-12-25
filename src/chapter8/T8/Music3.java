package chapter8.T8;

import java.util.Random;

class Instrument {

    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Woodwind2 extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Woodwind2.play() " + n);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Woodwind2");
    }
}

public class Music3 {

    private static final Random random = new Random();

    static Instrument nextInstrument() {
        switch (random.nextInt(6)) {
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Brass();
            case 4:
                return new Woodwind();
            case 5:
                return new Woodwind2();
        }
        return null;
    }

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[15];
        for (int i = 0; i < orchestra.length; ++i)
            orchestra[i] = nextInstrument();
        for (Instrument instrument : orchestra) {
            System.out.println(instrument.toString());
        }
    }
}
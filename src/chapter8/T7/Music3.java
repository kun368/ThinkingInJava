package chapter8.T7;

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
    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Woodwind2(),
        };
        for (Instrument instrument : orchestra) {
            System.out.println(instrument.toString());
        }
    }
}
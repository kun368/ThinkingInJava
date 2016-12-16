package chapter5.T12;

public class Tank {

    boolean isEmpty;

    public Tank(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    protected void finalize() throws Throwable {
        if(!isEmpty)
            System.out.println("Error! Tank must be empty!");
    }

    public static void main(String[] args) {
        new Tank(true);
        new Tank(false);
        System.gc();
    }
}

package chapter5.T22;

/**
 * Created by kun36 on 2016/12/18.
 */

public class Main {

    enum Type {
        AA, BB, CC, DD, EE, GG;
    }

    static void show(Type type) {
        switch (type) {
            case AA:
                System.out.println("Low");
                break;
            case BB:
            case CC:
            case DD:
            case EE:
                System.out.println("Mid");
                break;
            case GG:
                System.out.println("High");
                break;
        }
    }

    public static void main(String[] args) {
        for(Type type :  Type.values())
            show(type);
    }
}

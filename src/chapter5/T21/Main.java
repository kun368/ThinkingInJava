package chapter5.T21;

/**
 * Created by kun36 on 2016/12/17.
 */

enum Type {
    AA, BB, CC, DD, EE, GG;
}

public class Main {
    public static void main(String[] args) {
        for(Type type :  Type.values()) {
            System.out.println(type + " " + type.name() + " " + type.ordinal());
        }
    }
}

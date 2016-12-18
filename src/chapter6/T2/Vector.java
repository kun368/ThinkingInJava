package chapter6.T2;

/**
 * Created by kun36 on 2016/12/18.
 */
public class Vector {
    private String name;

    public Vector(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "name='" + name + '\'' +
                '}';
    }
}

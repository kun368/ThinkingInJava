package chapter5.T10;

/**
 * Created by kun36 on 2016/12/16.
 */
public class Student {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize...");
    }
}

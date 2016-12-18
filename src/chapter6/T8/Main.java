package chapter6.T8;

import chapter6.T8.util.Connection;
import chapter6.T8.util.ConnectionManager;

/**
 * Created by kun36 on 2016/12/18.
 */
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 100; ++i) {
            Connection connection = ConnectionManager.getConnection();
            if(connection == null)
                continue;
            connection.doSomething();
            if(i < 5) ConnectionManager.revert(connection);
        }
    }
}

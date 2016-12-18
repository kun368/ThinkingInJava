package chapter6.T8.util;

import java.util.List;
import java.util.Vector;

public class ConnectionManager {

    private static List<Connection> connections = new Vector<>();

    static {
        for(int i = 0; i < 10; ++i)
            connections.add(new Connection());
    }

    public static Connection getConnection() {
        if(connections.isEmpty())
            return null;
        Connection connection = connections.get(connections.size()-1);
        connections.remove(connections.size()-1);
        return connection;
    }

    public static void revert(Connection conn) {
        connections.add(conn);
    }
}

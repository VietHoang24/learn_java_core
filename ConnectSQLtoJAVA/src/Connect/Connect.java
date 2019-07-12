package Connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    static String user = "SA";
    static String password = "Doras2tuti";
    static String url = "jdbc:sqlserver://localhost:1433;databaseName=Student";

    public static Connection getConnect(){
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(url, user, password);
            System.out.println("Connect complete !!! ...");
        } catch (Exception e) {
            System.out.println("Connect fail !!!");
        }

        return connect;
    }
}

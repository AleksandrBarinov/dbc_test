package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class DBConnection {

    public static Connection getConnection() throws SQLException {
        //Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();

        DriverManager.registerDriver(new OracleDriver());

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@some_host:port:db_name", "db_user", "password");

        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
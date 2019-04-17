package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLRequest {

    public static void viewTable(Connection connection) throws SQLException {

        Statement statement = null;

        String query = "select * from some_table where client_id = 0123456789";

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            String orderId;

            while (resultSet.next()) {
                orderId = resultSet.getString("ORDER_ID");
                    System.out.println(orderId);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (statement != null) { statement.close(); }
        }
    }
}
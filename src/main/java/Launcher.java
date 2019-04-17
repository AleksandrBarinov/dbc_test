import util.DBConnection;
import util.SQLRequest;

import java.sql.SQLException;

public class Launcher {

    public static void main(String[] args) throws SQLException {

        DBConnection dbConnection = new DBConnection();

        SQLRequest sqlRequest = new SQLRequest();

        sqlRequest.viewTable(dbConnection.getConnection());

        dbConnection.closeConnection(dbConnection.getConnection());

    }
}
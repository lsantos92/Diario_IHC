
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conect {
    public static Connection getCon() {
        try {
            String url = "jdbc:sqlserver://localhost:3306;databaseName=login;";
            Connection connection = DriverManager.getConnection(url,"root","zaXXfbWqVDCNE29");
            return connection;
        } catch (SQLException exception) {
            throw new RuntimeException("Nao foi possivel conectar à BD!", exception);
        }
    }
}

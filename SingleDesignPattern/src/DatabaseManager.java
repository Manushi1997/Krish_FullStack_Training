import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseManager {
    private static volatile DatabaseManager dbManager;// = new DBManager();//
    private static volatile Connection connection;
    private DatabaseManager() {
        if (dbManager != null) {
            throw new RuntimeException("Please use getDBManager method");
        }

    }

    public static DatabaseManager getDbManager() {
        if (dbManager == null) {

            synchronized (DatabaseManager.class) {
                if (dbManager == null) {
                    dbManager = new DatabaseManager();
                }}

        }
        return  dbManager;

    }

    public Connection getConnection() throws SQLException {
        if (connection==null){
            synchronized (DatabaseManager.class){
                if(connection==null){
                    String url ="jdbc:deby:memory:sample:create=true";
                    try {
                        connection = DriverManager.getConnection(url);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
        return connection;
    }
}

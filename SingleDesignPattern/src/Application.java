import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {

        long start;
        long end;

        DatabaseManager dbManager=DatabaseManager.getDbManager();


        System.out.println(dbManager);

        start =System.currentTimeMillis();

        Connection connection = dbManager.getConnection();
        end =System.currentTimeMillis();

        System.out.println(end-start);

        //  DBManager dbManager1 = DBManager.getDbManager();
        DatabaseManager dbManager1=DatabaseManager.getDbManager();
        Connection connection1 = dbManager1.getConnection();
        start =System.currentTimeMillis();
        System.out.println(dbManager1);
        end =System.currentTimeMillis();

        System.out.println(end-start);
    }
}
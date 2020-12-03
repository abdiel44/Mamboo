import java.sql.*;
import java.sql.DriverManager;

public class DbConnection  {

    public DbConnection()
    {
        getConnection();
    }

    public Connection getConnection()
    {
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mamboo?serverTimezone=UTC","stevenabdiel44","mpA3kYPAFIujEpE7");

        }catch(SQLException e)
        {
            System.out.println(e);
        }

        return connection;
    }

}

public class CoreController
{
    public static LogIn login = null;

    public static void main(String[] args)
    {
        //SingUp singUp = new SingUp();
        //Dashboard dashboard = new Dashboard();

        DbConnection connection = new DbConnection();
        connection.getConnection();
        boolean singOut= false;

        if(!singOut)
        {
            login = new LogIn();
        }
    }
}

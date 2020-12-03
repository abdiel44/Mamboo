import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogInModel
{
    private String userName;

    private String password;

    int userId;

    static boolean existe = false;

    public LogInModel(String userName, String password) //Save the data from the LogIn view//
    {
        setUserName(userName);
        setPassword(password);
        authentication(getPassword(), getUserName());
    }

    public static void authentication(String password, String userName)
    {
        boolean exist = false;

        DbConnection db_connect = new DbConnection();

        PreparedStatement statement=null;
        ResultSet resultSets=null;

        try(Connection conexion = db_connect.getConnection())  {
            String query="select * from Mamboo.users where UserName = ?"; //getting the data for the enter user on the text field
            statement=conexion.prepareStatement(query);
            statement.setString(1, userName);
            resultSets=statement.executeQuery();

            while(resultSets.next()){

                if( userName.equals(resultSets.getString("UserName"))) //if the database username is equals to the text field.
                {
                    System.out.println("EL usuario existe");
                    if (password .equals(resultSets.getString("Password")))//if the database password is equals to the text field.
                    {

                        System.out.println("SESION INICIADA");
                        Dashboard dashboard = new Dashboard();
                        exist = true;

                    }
                    else{System.out.println("Incorrect Password");}
                }else
                    {

                        System.out.println(resultSets.getString("UserName"));
                        System.out.println("El usuario no existe");
                        System.out.println(userName);
                    }
            }
        }catch(SQLException e){
            System.out.println("No es posible iniciar sesion");
            System.out.println(e);
        }

        existe = exist;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


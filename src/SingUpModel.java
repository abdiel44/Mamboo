import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SingUpModel
{
    String Fname = null;
    String Lname= null;
    String address= null;
    String description= null;
    String phone= null;
    String user= null;
    String password= null;
    boolean succesLogIn = false;

    public SingUpModel(String Fname, String Lname, String phone, String userName, String password, String Address, String description)
    {
        setFname(Fname);
        setLname(Lname);
        setUser(userName);
        setPassword(password);
        setAddress(Address);
        setPhone(phone);
        setDescription(description);

        SingUp(getFname(),getLname(),getPhone(),getUser(), getPassword(), getAddress(), getDescription());
    }

    public void SingUp(String Fname, String Lname, String phone, String userName, String password, String Address, String description)
    {
        DbConnection db_connect = new DbConnection();

        PreparedStatement statement=null;
        ResultSet resultSets=null;

        try(Connection conexion = db_connect.getConnection())
        {
            String query = "INSERT INTO Mamboo.users (Fname, Lname, UserName, Password, Phone, Address, Description) VALUES (?,?,?,?,?,?,?)";
            statement=conexion.prepareStatement(query);
            statement.setString(1, Fname);
            statement.setString(2, Lname);
            statement.setString(3, userName);
            statement.setString(4, password);
            statement.setString(5, phone);
            statement.setString(6, Address);
            statement.setString(7, description);
            statement.executeUpdate();

            succesLogIn = true;

        } catch(SQLException e)
        {
            System.out.println("No es posible someter los datos");
            System.out.println(e);
        }
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

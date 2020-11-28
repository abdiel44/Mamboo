public class LogInModel
{
    private String userName;

    private String password;

    public LogInModel(String userName, String password) //Save the data from the LogIn view//
    {
        setUserName(userName);
        setPassword(password);
    }

    public static void authentication(LogIn logIn)
    {
        logIn.dispose();
        Dashboard dashboard = new Dashboard();
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


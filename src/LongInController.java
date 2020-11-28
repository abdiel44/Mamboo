
public class LongInController extends CoreController
{

    public void logInAuthentication()
    {
        LogInModel.authentication(super.login);
    }
}

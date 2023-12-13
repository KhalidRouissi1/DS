package package2;

import java.io.IOException;
import java.util.Scanner;

public class Authentification {
    final private String LoginCorrect="scott" , PwdCorrect="tiger";
    private String userLogin;
    private String userPwd;
    public Authentification()throws WrongLoginException,WrongPwdException,WrongInputLength, IOException
    {
        this.getUserLogin();
        this.getUserPwd();
    }
    public void getUserLogin() throws WrongLoginException,WrongInputLength
    {
        Scanner inp = new Scanner(System.in);
        userLogin = inp.nextLine();
        if(userLogin.length() >10)
        {
            throw new WrongInputLength("Length too long");
        }
        if(!userLogin.equals(LoginCorrect)){
            throw new WrongLoginException("Unknowen login");
        }

    }
    public void getUserPwd() throws WrongPwdException,WrongInputLength
    {
        Scanner inp = new Scanner(System.in);
        userPwd = inp.nextLine();

        if(!userPwd.equals(PwdCorrect)){
            throw new WrongPwdException("Unknowen password");
        }
        if(userPwd.length() >10)
        {
            throw new WrongInputLength("Length too long");
        }
    }


}

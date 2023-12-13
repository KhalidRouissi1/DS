package package2;

import java.io.IOException;

public class TestAuthentification  {
    private static boolean test = false;

    public static void main(String[] args) throws WrongPwdException, WrongLoginException, WrongInputLength {

        do{
            try {
                Authentification auth = new Authentification();
                test=true;
            }
            catch (WrongInputLength e){
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                System.exit(0);

            }
            catch (WrongPwdException e){
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());

            }catch (WrongLoginException e){
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());

            }catch (IOException e){
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                System.exit(0);
            }
        }while (!test);
    }
}

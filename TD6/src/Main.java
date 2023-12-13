// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("suite");
        try{
            double n = Double.parseDouble(args[0]);
            double x = Double.parseDouble(args[1]);
            System.out.println(Mathematique.f(n,x));
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
                 System.out.println(e.getStackTrace());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        catch (ParametreNullException e){
            System.out.println(e.getMessage());
        }
        catch (NegatifException e)
        {
            System.out.println(e.getMessage());
        }

            finally {
            System.out.println("bloc finally \n" +"exécuté quel que soit le résultat d’exécution");
        }
    }
}
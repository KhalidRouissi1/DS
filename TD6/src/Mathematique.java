public class Mathematique  {
    static double f(double n , double x) throws ParametreNullException,NegatifException {

            if(n==0)
            {
                throw  new ParametreNullException("NULL");
            }
            if(x==-3)
            {
                throw new NegatifException("X == -3 you can't handle that");
            }

                return Math.sqrt(x)/n;
    }
}

import java.io.IOException;

/**
 * Created by laptop on 10/01/2023
 * What is the 10 001st prime number?
 **/
public class Euler7
{
   static boolean is_Prime(double x)
   {
      for (long i = 2; i<=x /2; i++)
      {
         if(x%i ==0)
         {
            return false;
         }
      }
      return true;
   }
   public static void main(String[] args) throws IOException
   {

      long start;
      int primeCount = 0;

      for (start = 1; primeCount <= 10001 ; start++)
      {
         if (is_Prime(start))
         {
            primeCount++;
         }
      }
      System.out.print(start - 1);
   }
}

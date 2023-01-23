package JavaSolutions;
import java.io.IOException;

import static java.lang.System.exit;

/**
 * Created by laptop on 10/01/2023
 * What is the largest prime factor of the number 600851475143 ?
 **/
public class Euler3
{
   static boolean is_Prime(double x)
   {
      for (long i = 2; i<=x /2; i++)
      {
         if(x%i == 0)
         {
            return false;
         }
      }
      return true;
   }
   public static void main(String[] args) throws IOException
   {

      long origin = 600851475143L;
      double denominator;

      for (denominator = 1; denominator < origin / 2.0; denominator++)
      {
         double result = origin/denominator;

         //checks if result is an int first, as this speeds up the process
         if (result == (int)result && is_Prime(result))
         {
            System.out.println(result);
            exit(1);
         }
      }
   }
}

import java.io.IOException;

/**
 * Created by laptop on 10/01/2023
 * What is the value of the first triangle number to have over
 * five hundred divisors?
 **/
public class Euler12
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

   static int triangleNumbers(int lastNumber, int divisors, int steps)
   {
      int dCheck = 0;
      for (int i = (lastNumber / 2); i > 0; i--)
      {
         if (lastNumber % i == 0)
         {
            dCheck++;
         }
      }
      if (divisors <= dCheck)
      {
         return lastNumber;
      }
      else
      {
         steps++;
         return triangleNumbers(lastNumber + steps, divisors, steps);
      }
   }


   public static void main(String[] args) throws IOException
   {
      System.out.print(triangleNumbers(1, 500, 1));

   }
}



package JavaSolutions;

import java.io.IOException;

import static java.lang.System.exit;

/**
 * Created by laptop on 10/01/2023
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?JavaSolutions.Euler5
 **/
public class Euler5
{

   public static void main(String[] args) throws IOException
   {
      long x;
      boolean found;
      //There is an assumption here that the number is less than 9 9's. It is.
      for (x = 10; x < 999999999; x++ )
      {
         found = true;
         for (long y = 20; y > 1; y--)
         {
            if (x % y != 0)
            {
               found = false;
               break;
            }
         }
         //We will only print if the number is divisible by all numbers.
         if (found)
         {
            System.out.println(x);
            exit(1);
         }
      }
   }
}

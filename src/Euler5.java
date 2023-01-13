import java.io.IOException;

import static java.lang.System.exit;

/**
 * Created by laptop on 10/01/2023
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?Euler5
 **/
public class Euler5
{

   public static void main(String[] args) throws IOException
   {
      long x;
      boolean found = true;
      for (x = 10; x < 999999999; x++ )
      {
         found = true;
         for (long y = 20; y > 1; y--)
         {
            if (x % y == 0)
            {

            }
            else
            {
               found = false;
               break;
            }
         }
         if (found)
         {
            System.out.println(x);
            exit(1);
         }
      }
   }
}

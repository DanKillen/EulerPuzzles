package JavaSolutions;

import java.io.IOException;

import static java.lang.System.exit;

/**
 * Created by laptop on 10/01/2023
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 **/
public class Euler9
{
   //This function will check the integers given against the criteria
   static boolean isAnswer(int x, int y, int z)
   {
         if(x*x + y*y == z*z && x + y + z == 1000)
         {
            System.out.println("x = " + x + " y = " + y + " z = " + z);
            System.out.println(x * y * z);
            exit(1);
         }
      return false;
   }
   public static void main(String[] args) throws IOException
   {
      //main will loop over integers until the answer is given
      //program will exit before bool expression is confirmed
      boolean finished = false;
      for (int x = 1; !finished; x++)
      {
         for (int y = 1; y < 1000; y++)
         {
            for (int z = 1; z < 1000; z++)
            {
               finished = isAnswer(x,y,z);
            }
         }
      }
   }
}

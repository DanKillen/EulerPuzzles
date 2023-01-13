import java.io.IOException;

/**
 * Created by laptop on 10/01/2023
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 **/
public class Euler1
{
   public static void main(String[] args) throws IOException
   {
      int totalx = 0;
      int totaly = 0;
      int totalz = 0;
      for (int x = 3; x < 1000; x = x + 3)
      {
         totalx += x;
      }
      for (int y = 5; y < 1000; y = y + 5)
      {
         totaly += y;
      }

      for (int z = 15; z < 1000; z = z + 15)
      {
         totalz += z;
      }

      int totalxy = totalx + totaly - totalz;
      System.out.println(totalxy);
   }
}

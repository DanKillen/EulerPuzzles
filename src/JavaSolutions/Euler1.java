package JavaSolutions;
import java.io.IOException;
/**
 * Created by laptop on 10/01/2023
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 **/
public class Euler1
{
   public static void main(String[] args) throws IOException
   {
      int multiplesOf3 = 0;
      int multiplesOf5 = 0;
      int multiplesOf15 = 0;

      //Calculating multiples of 3
      for (int x = 3; x < 1000; x = x + 3)
      {
         multiplesOf3 += x;
      }
      //Calculating multiples of 5
      for (int y = 5; y < 1000; y = y + 5)
      {
         multiplesOf5 += y;
      }
      //Multiples of 15 are counted twice, we must remove one instance of them
      for (int z = 15; z < 1000; z = z + 15)
      {
         multiplesOf15 += z;
      }

      int answer = multiplesOf3 + multiplesOf5 - multiplesOf15;
      System.out.println(answer);
   }
}

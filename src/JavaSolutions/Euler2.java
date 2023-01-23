package JavaSolutions;

import java.io.IOException;

/**
 * Created by laptop on 10/01/2023
 * By considering the terms in the Fibonacci sequence whose values do not
 * exceed four million, find the sum of the even-valued terms.
 **/
public class Euler2
{
   public static void main(String[] args) throws IOException
   {
      int newFib;
      int greatest = 2;
      int secondGreatest = 1;
      int evenSum = 0;

      while (greatest < 4000000)
      {
         // Adding the Fibonacci number if it is even
         if (greatest % 2 == 0)
         {
            evenSum += greatest;
         }
         //Working out the next Fibonacci number
         newFib = greatest + secondGreatest;
         secondGreatest = greatest;
         greatest = newFib;
      }
      System.out.print(evenSum);
   }
}

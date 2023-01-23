package JavaSolutions;

import java.io.IOException;

/**
 * Created by laptop on 10/01/2023
 * Find the difference between the sum of the squares of the first one
 * hundred natural numbers and the square of the sum.
 **/
public class Euler6
{

   public static void main(String[] args) throws IOException
   {
      long squareOfSum = 0;
      long sumOfSquare = 0;

      //finding the sum of the squares
      for (int x = 1; x <= 100; x++)
      {
         sumOfSquare += x * x;
      }

      //finding the square of the sums
      for (int y = 1; y <= 100; y++)
      {
         squareOfSum += y;
      }
      squareOfSum = squareOfSum * squareOfSum;

      //printing the findings and the difference
      System.out.println("Square of sum = " + squareOfSum + ".");
      System.out.println("Sum of square = " + sumOfSquare + ".");
      System.out.println("The difference is " + (squareOfSum - sumOfSquare) + ".");

   }
}


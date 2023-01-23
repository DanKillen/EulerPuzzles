package JavaSolutions;

import java.io.IOException;

/**
 * Created by laptop on 10/01/2023
 * What is the value of the first triangle number to have over
 * five hundred divisors?
 **/
public class Euler12
{
   static int DIVISORS = 500;
   //Recursion took far too long with this problem
   //Instead I worked it iteratively

   //This function will return the first triangle number which
   //has a number of divisors over the parameter passed to it
   static int triangleNumbers(int divisors)
   {
      int lastNumber = 0;
      for (int addNumber = 1; true; addNumber++)
      {
         lastNumber += addNumber;
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
      }
   }

   public static void main(String[] args) throws IOException
   {
      System.out.print(triangleNumbers(DIVISORS));
   }
}




import java.io.IOException;

/**
 * Created by laptop on 10/01/2023
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 **/
public class Euler2
{
   public static void main(String[] args) throws IOException
   {
      int edge = 0;
      int greatest = 2;
      int secondG = 1;
      int thirdG = 0;
      int evenSum = 0;

      while (greatest < 4000000)
      {
         if (greatest % 2 ==0)
         {
            evenSum += greatest;
         }
         edge = greatest + secondG;
         thirdG = secondG;
         secondG = greatest;
         greatest = edge;
      }
      System.out.print(evenSum);
   }
}

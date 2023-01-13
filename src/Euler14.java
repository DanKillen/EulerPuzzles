import java.io.IOException;

/**
 * Created by laptop on 12/01/2023
 * Which starting number, under one million, produces the longest collatz chain?
 **/
public class Euler14
{

      static int collatz_steps(int n, int steps)
      {
         if (n == 1)
            return steps;
         else if ((n % 2) == 0)
         {
            steps++;
            return 1 + collatz_steps(n / 2, steps);
         } else
         {
            steps++;
            return 1 + collatz_steps(3 * n + 1, steps);
         }
      }

      public static void main(String[] args) throws IOException
      {
         int longestChain = 1;
         int startingNumber = 0;
         for (int i = 0; i < 1000000; i++)
         {
            if ((collatz_steps(i,0)) > longestChain)
            {
               longestChain = (collatz_steps(i,0));
               startingNumber = i;
            }
            System.out.println("The number " + startingNumber + " gave us a chain of " + longestChain + " steps!");
         }
      }
}

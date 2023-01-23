package JavaSolutions;

import java.io.IOException;

/**
 * Created by laptop on 10/01/2023
 * Find the sum of all the primes below two million.
 * (This works but takes a long time due to the division,
 * I must research primes (The Sieve of Eratosthenes))
 **/
public class Euler10
{
   //Re-using is_Prime again!

   public static void main(String[] args) throws IOException
   {
      final int LIMIT = 2000000;

      int check;
      int [] lowPrimeArray = {29, 23, 19, 17, 13, 11, 7, 5, 3, 2};
      //primeCount is 129, this is every prime added up to 29
      long primeCount = 129;
      for (check = 31; check <= LIMIT ; check += 2)
      {
         boolean divisibleByLowPrimes = false;
         for (int j : lowPrimeArray)
         {
            if (check % j == 0)
            {
               divisibleByLowPrimes = true;
               break;
            }
         }
         if (!divisibleByLowPrimes && Euler3.is_Prime(check))
         {
            primeCount += check;
         }
      }
      System.out.print(primeCount);
   }
}

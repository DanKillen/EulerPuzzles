import java.io.IOException;

/**
 * Created by laptop on 10/01/2023
 * Find the sum of all the primes below two million.
 * (This works but takes a long time due to the division, I must research primes (The Sieve of Eratosthenes))
 **/
public class Euler10
{
   static boolean is_Prime(int x)
   {
      for (int i = 2; i<=x /2; i++)
      {
         if(x%i ==0)
         {
            return false;
         }
      }
      return true;
   }
   public static void main(String[] args) throws IOException
   {
      final int LIMIT = 2000000;

      int check;
      long primeCount = 0;

      for (check = 2; check <= LIMIT ; check++)
      {
         if (is_Prime(check))
         {
            primeCount += check;
         }
      }
      System.out.print(primeCount);
   }
}

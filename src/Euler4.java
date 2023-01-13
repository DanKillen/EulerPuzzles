import java.io.IOException;

/**
 * Created by laptop on 10/01/2023
 * Find the largest palindrome made from the product of two 3-digit numbers.
 **/
public class Euler4
{
   static boolean is_Palindrome(int x)
   {
      String check = String.valueOf(x);
      StringBuilder sb = new StringBuilder();
      sb.append(check);
      String reverse = String.valueOf(sb.reverse());
      if (check.equals(reverse))
      {
         return true;
      }
      return false;
   }

   public static void main(String[] args) throws IOException
   {
      int max = 0;
       for(int x = 999; x>99;x--)
       {
          for(int y = 999; y>99;y--)
          {
             int input = x * y;
             if (is_Palindrome(input) & input > max)
             {
                max = input;
                System.out.println("x is " + x + ". y is " + y + ". input is " + input);
             }
          }
       }
       System.out.print(max);
   }
}

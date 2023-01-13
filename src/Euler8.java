import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Character.getNumericValue;

/**
 * Created by laptop on 10/01/2023
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 **/
public class Euler8
{
    public static void main(String[] args) throws IOException
   {
      FileReader input = new FileReader("Euler8.txt");
      BufferedReader buffer = new BufferedReader(input);
      String numberRef = buffer.readLine();
      int lengthOfSeries = 13;
      long product;
      long productMax = 1;

      for (int i = 0, j = lengthOfSeries; j <= 1000; i++, j++)
      {
         String numberCheck = numberRef.substring(i, j);
         char[] ch = numberCheck.toCharArray();
         product = 0;
         product = Character.getNumericValue(ch[0]);
         for(int k = 1; k < lengthOfSeries; k++)
         {
            product *= Character.getNumericValue(ch[k]);
         }
         if (product > productMax)
         {
            productMax = product;
         }
      }
      System.out.println(productMax);

   }
}

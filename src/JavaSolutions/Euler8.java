package JavaSolutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by laptop on 10/01/2023
 * Find the thirteen adjacent digits in the 1000-digit number that have the
 * greatest product. What is the value of this product?
 **/
public class Euler8
{
    public static void main(String[] args) throws IOException
   {
      //Reading in the file
      FileReader input = new FileReader("Euler8.txt");
      BufferedReader buffer = new BufferedReader(input);
      String numberRef = buffer.readLine();

      int lengthOfSeries = 13;
      long product;
      long productMax = 1;

      //Iterates over the file in 13 digit chunks and save the greatest product
      for (int i = 0, j = lengthOfSeries; j <= 1000; i++, j++)
      {
         String numberCheck = numberRef.substring(i, j);
         char[] ch = numberCheck.toCharArray();
         product = Character.getNumericValue(ch[0]);

         //Loop starts at 1 as product is already set to the character at 0
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

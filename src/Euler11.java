import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by laptop on 10/01/2023
  * What is the greatest product of four adjacent numbers in the same direction
 * (up, down, left, right, or diagonally) in the 20×20 grid?
 **/
public class Euler11
{

   public static void main(String[] args) throws IOException
   {

      FileReader input = new FileReader("Euler11.txt");
      Scanner buffer = new Scanner(input);
      int a[][] = new int[20][20];


      for (int i = 0; i < 20; i++)
      {
         for (int k = 0, l = 0, m = 1; k < 20; k++, m = m + 2, l = l + 2)
         {
            a[i][k] = buffer.nextInt();
            System.out.print(a[i][k]+",");
         }
         System.out.println();
      }
      int checkAcross = 0, checkDown = 0,
              checkLeft = 0,checkRight = 0,checkMax = 0;
      int maxProd;
      for (int x = 0; x < 20; x++)
      {
         for (int y = 0; y < 20; y++)
         {
            if (x + 3 < 20)
            {
               checkDown = a[x][y] * a[x+1][y] * a[x+2][y] * a[x+3][y];
            }
            if (y + 3 < 20)
            {
               checkAcross = a[x][y] * a[x][y+1] * a[x][y+2] * a[x][y+3];
            }
            if (x + 3 < 20 && y + 3 < 20)
            {
               checkRight = a[x][y] * a[x+1][y+1] * a[x+2][y+2] * a[x+3][y+3];
            }
            if (x - 3 > 0 && y + 3 < 20)
            {
               checkLeft = a[x][y] * a[x-1][y+1] * a[x-2][y+2] * a[x-3][y+3];
            }
            if (checkAcross > checkMax)
            {
               checkMax = checkAcross;
            }
            if (checkDown > checkMax)
            {
               checkMax = checkDown;
            }
            if (checkLeft > checkMax)
            {
               checkMax = checkLeft;
            }
            if (checkRight > checkMax)
            {
               checkMax = checkRight;
            }
         }
      }
      System.out.print(checkMax);
   }
}

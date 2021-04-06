/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    9 
Program:       1
ProgramName:   SumArrayColumns
Purpose:       Finds sum of all elements in a column in a matrix 
Operation:     When the program is run, it prints sum 
Input(s):      2D array of numbers and column index
Output(s):     Sum 
Methodology:   Scanner, arrays
References:
Time Spent:    15 min.
***************************************************************************/
import java.util.*;
public class SumArrayColumns
{
   public static void main (String[] args)
   {
      boolean rerun = true;
      while (rerun)
      {
         double[][] matrix = new double[3][4];
         Scanner input = new Scanner (System.in);
         System.out.print("Enter a 3-by-4 matrix row by row: ");
         for (int i = 0; i < matrix.length; i++)
         {
            for (int k = 0; k < matrix[i].length; k++)
               matrix[i][k] = input.nextDouble();
         }
      
         for (int i = 0; i <= matrix.length; i++)
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
         
         System.out.print("Would you like to run it again? (y/n)");
         String choice = input.next();
         if (choice.equalsIgnoreCase("n"))
            rerun = false;
      }
   }
   public static double sumColumn(double[][] m, int columnIndex)
   {
      double sum = 0;
      for (int i = 0; i < m.length; i++)
         sum += m[i][columnIndex];
      return sum;
   }
}

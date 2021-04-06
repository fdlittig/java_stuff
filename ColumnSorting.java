/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    9 
Program:       3
ProgramName:   ColumnSorting   
Purpose:       Sorts numbers in the columns of a matrix 
Operation:     When the program is run, it sorts columns 
Input(s):      2D array
Output(s):     Sorted 2D array 
Methodology:   Scanner, arrays
References:    Stack Overflow for output formatting
Time Spent:    20 min.
***************************************************************************/
import java.util.*;
public class ColumnSorting
{
   public static void main (String[] args)
   {
      boolean rerun = true;
      while (rerun)
      {
         Scanner input = new Scanner (System.in);
         System.out.print("Enter the dimensions of the matrix ([r][c]): ");
         int r = input.nextInt();
         int c = input.nextInt();
         double[][] matrix = new double[r][c];
         System.out.print("Enter the matrix row by row: ");
         for (int i = 0; i < matrix.length; i++)
         {
            for (int k = 0; k < matrix[i].length; k++)
               matrix[i][k] = input.nextDouble();
         }
         double[][] sortedMatrix = sortColumns(matrix);
         System.out.println("The column-sorted array is ");
         for (int i = 0; i < sortedMatrix.length; i++) //format & print sorted array
         {
            for (int j = 0; j < sortedMatrix[i].length; j++) 
               System.out.printf("%2.3f ", sortedMatrix[i][j]);
            System.out.println("");
         }
        
         System.out.print("Would you like to run it again? (y/n)");
         String choice = input.next();
         if (choice.equalsIgnoreCase("n"))
            rerun = false;
      }
   }
   public static double[][] sortColumns(double[][] m)
   {
      double[][] sortedMatrix = new double[m.length][m[0].length];
   
      for (int i = 0; i < m.length; i++) //makes new array from parameter
      {
         for (int j = 0; j < m[i].length; j++) 
            sortedMatrix[i][j] = m[i][j];
      }
   
      for (int j = 0; j < sortedMatrix[0].length; j++) 
      {
         for (int i = 0; i < sortedMatrix.length - 1; i++) 
         {
            double currentMin = sortedMatrix[i][j];
            int minIndex = i;
         
            for (int row = i + 1; row < sortedMatrix.length; row++) 
            {
               if (currentMin > sortedMatrix[row][j]) 
               {
                  currentMin = sortedMatrix[row][j];
                  minIndex = row;
               }
            }
            if (minIndex != i) 
            {
               sortedMatrix[minIndex][j] = sortedMatrix[i][j];
               sortedMatrix[i][j] = currentMin;
            }
         }
      }
      return sortedMatrix;
   }
}
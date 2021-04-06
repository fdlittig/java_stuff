/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    9 
Program:       2
ProgramName:   AddMatricies   
Purpose:       Adds two matrices 
Operation:     When the program is run, it adds matricies 
Input(s):      Two matrices
Output(s):     Sum of elements 
Methodology:   Scanner, arrays
References:    Stack Overflow for output formatting
Time Spent:    20 min.
***************************************************************************/
import java.util.*;
public class AddMatricies
{
   public static void main (String[] args)
   {
      boolean rerun = true;
      while (rerun)
      {
         double[][] m1 = new double[3][3];
         double[][] m2 = new double[3][3];
         Scanner input = new Scanner (System.in);
         System.out.print("Enter matrix1: ");
         for (int i = 0; i < m1.length; i++)
         {
            for (int k = 0; k < m1[i].length; k++)
               m1[i][k] = input.nextDouble();
         }
         System.out.print("Enter matrix2: ");
         for (int i = 0; i < m2.length; i++)
         {
            for (int k = 0; k < m2[i].length; k++)
               m2[i][k] = input.nextDouble();
         }
         
         double[][] matrixSum = addMatrix(m1, m2);
         System.out.println("The matrices are added as follows");
         for (int i = 0; i < m1.length; i++) 
         {
            for (int k = 0; k < m1[i].length; k++) //format & print array1
            {
               System.out.printf("%2.1f ", m1[i][k]);
               if (i == 1 && k == 2) 
                  System.out.printf("%2s ", " + ");
               else 
                  System.out.printf("%3s ", " ");
            }
            
            for (int k = 0; k < m2[i].length; k++) //format & print array2
            {
               System.out.printf("%2.1f ", m2[i][k]);
               if (i == 1 && k == 2) 
                  System.out.printf("%2s ", " = ");
               else 
                  System.out.printf("%3s ", " ");
            }
            for (int k = 0; k < matrixSum[i].length; k++) 
               System.out.printf("%4.1f ", matrixSum[i][k]);
            System.out.println("");
         }
         
         System.out.print("Would you like to run it again? (y/n)");
         String choice = input.next();
         if (choice.equalsIgnoreCase("n"))
            rerun = false;
      }
   }
   public static double[][] addMatrix(double[][] a, double[][] b)
   {
      double[][] matrixSum = new double[a.length][a[0].length];
      for (int i = 0; i < a.length; i++)
      {
         for (int k = 0; k < a[0].length; k++)
            matrixSum[i][k] = a[i][k] + b[i][k]; //adds same indexes of a and b
      }   
      return matrixSum;
   }
}
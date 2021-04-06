/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    8 
Program:       2
ProgramName:   Statistics
Purpose:       Computes mean and deviation of a set of numbers 
Operation:     When the program is run, it prints mean/deviation 
Input(s):      Array of numbers
Output(s):     Mean and deviation 
Methodology:   Scanner, arrays
References:
Time Spent:    20 min.
***************************************************************************/
import java.util.*;
public class Statistics
{
   public static void main (String[] args)
   {
      boolean rerun = true;
      while (rerun)
      {
         double[] nums = new double[10];
         Scanner input = new Scanner (System.in);
         System.out.print("Enter ten numbers: ");
         for (int i = 0; i < nums.length; i++)
            nums[i] = input.nextDouble();
         System.out.println("The mean is " + mean(nums));
         System.out.println("The standard deviation is " + deviation(nums));
         
         System.out.print("Would you like to run it again? (y/n)");
         String choice = input.next();
         if (choice.equalsIgnoreCase("n"))
            rerun = false;
      }
   }
   public static double deviation(double[] x)
   {
      double mean = mean(x);
      double deviation = 0;
      for (int i = 0; i < x.length; i++) 
         deviation += Math.pow(x[i] - mean, 2);
      return Math.round(Math.sqrt(deviation / (x.length - 1)) * 100000d) / 100000d;
   }
   public static double mean(double[] x)
   {
      double sum = 0;
      for (int i = 0; i < x.length; i++)
         sum += x[i];
      return Math.round((sum / x.length) * 100d) / 100d;
   }
}
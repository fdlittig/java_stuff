/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    8 
Program:       1
ProgramName:   CountOccurances
Purpose:       Prints occurances of numbers 
Operation:     When the program is run, it prints numbers 
Input(s):      Set of numbers between 1 and 100
Output(s):     Occurances 
Methodology:   Scanner, arrays
References:
Time Spent:    20 min.
***************************************************************************/
import java.util.*;
public class CountOccurances
{
   public static void main (String[] args)
   {
      int[][] numbers = new int[2][100];
      boolean rerun = true;
      while (rerun)
      {
         Scanner input = new Scanner (System.in);
         System.out.print("Enter integers between 1 and 100: ");
         for (int i = 0; i < 100; i++)
         {
            int n = input.nextInt();
            if (n == 0)
               break;
            else
            {
               numbers[0][i] = n; //sets top row with numbers
               numbers[1][n] += 1; //sets bottom row with their count
            }
         }
         for (int i = 0; i < numbers[1].length; i++) //loop through bottom row
         {
            if (numbers[1][i] == 0)
               continue;
            if (numbers[1][i] > 1)
               System.out.println(i + " occurs " + numbers[1][i] + " times");
            else
               System.out.println(i + " occurs " + numbers[1][i] + " time");
         }
         
         System.out.print("Would you like to run it again? (y/n)");
         String choice = input.next();
         if (choice.equalsIgnoreCase("n"))
            rerun = false;
      }
   }
}

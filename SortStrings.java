/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    8 
Program:       3
ProgramName:   SortStrings
Purpose:       Sort strings of names alphabetically 
Operation:     When the program is run, it prints names 
Input(s):      Array of strings
Output(s):     Sorted array  
Methodology:   Scanner, arrays
References:
Time Spent:    20 min.
***************************************************************************/
import java.util.*;
public class SortStrings
{
   public static void main (String[] args)
   {
      boolean rerun = true;
      while (rerun)
      {
      
         Scanner input = new Scanner (System.in);
         System.out.print("Enter the size of the list of names: ");
         String[] names = new String[input.nextInt()];
         System.out.print("Enter the names: ");
         for (int i = 0; i < names.length; i++)
            names[i] = input.next();
         System.out.println("List Before Sorting:" + Arrays.toString(names));
         System.out.println("List After Sorting:" + Arrays.toString(sort(names)));
         
         System.out.print("Would you like to run it again? (y/n)");
         String choice = input.next();
         if (choice.equalsIgnoreCase("n"))
            rerun = false;
      }
   }
   public static String[] sort(String[] s)
   {
      for (int i = 1; i < s.length; i++) 
      {
         int k = i - 1;
         for (int j = i; j < s.length; j++) //find index of smallest value
         {
            if (s[j].compareTo(s[k]) < 0)
               k = j;
         }
         String temp = s[i - 1]; //swap smallest value into index before it (i - 1)
         s[i - 1] = s[k];
         s[k] = temp;
      }
      return s; 
   }
}
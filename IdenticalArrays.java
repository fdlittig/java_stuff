/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    8 
Program:       4
ProgramName:   IdenticalArrays
Purpose:       Sort strings of names alphabetically 
Operation:     When the program is run, it prints names 
Input(s):      Array of strings
Output(s):     Sorted array  
Methodology:   Scanner, arrays
References:
Time Spent:    20 min.
***************************************************************************/
import java.util.*;
public class IdenticalArrays
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner (System.in);
      System.out.print("Enter list1: ");
      int size = input.nextInt();
      int[] one = new int[size];
      for (int i = 0; i < size; i++)
         one[i] = input.nextInt();
      
      System.out.print("Enter list2: ");
      int[] two = new int[size];
      for (int i = 0; i < size; i++)
         two[i] = input.nextInt();
      
      if (!(equalsThis(one, two)))
         System.out.println("Two lists are not identical");
      else
         System.out.println("Two lists are identical");    
   }
   public static boolean equalsThis(int[] list1, int[] list2)
   {
      if (list1.length != list2.length)
         return false;
       
      for (int i = 0; i < list1.length; i++)
      {
         if (i == list2[i])
            return true;
      }
      return false;
   }
}
        


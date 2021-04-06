/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    7 
Program:       2 
ProgramName:   CheckPassword
Purpose:       Determines if a password is valid. 
Operation:     When the program is run, it prints valid/invalid. 
Input(s):      Password
Output(s):     Valid/Invalid 
Methodology:   Scanner, if statements, boolean methods
References:
Time Spent:    15 min.
***************************************************************************/
import java.util.*;
public class CheckPassword
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner (System.in);
      System.out.print("Enter your password: ");
      String p = input.next();
      if (numOfCharacters(p) == true && onlyNumAndDigits(p) == true && numOfDigits(p) == true)
         System.out.println(p + " is valid");
      else
         System.out.println(p + " is invalid");
   }
   public static boolean numOfCharacters(String passw)
   {
      if (passw.length() >= 8)
         return true;
      else
         return false;
   }
   public static boolean onlyNumAndDigits(String passw)
   {
      for (int i = 0; i < passw.length(); i++)
      {
         char c = passw.charAt(i);
         if (!Character.isLetter(c) && !Character.isDigit(c))
            return false;
         else 
            break;
      }
      return true;
   }
   public static boolean numOfDigits(String passw)
   {
      int count = 0;
      for (int i = 0; i < passw.length(); i++)
      {
         char c = passw.charAt(i);
         if (Character.isDigit(c))
            count++;
      }
      if (count < 2)
         return false;
      else
         return true;
   }
}
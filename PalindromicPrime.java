/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    7 
Program:       4
ProgramName:   PalindromicPrime
Purpose:       Prints numbers that are both palindromic and prime
Operation:     When the program is run, it prints numbers 
Input(s):      None
Output(s):     First 100 palindromic prime numbers
Methodology:   If statements, methods
References:
Time Spent:    20 min.
***************************************************************************/
import java.util.*;
public class PalindromicPrime
{
   public static void main (String[] args)
   {
      int end = 0;
      for (int i = 2; i <= 94049; i++)
      {
         if (isPalindrome(i) && isPrime(i))
         {
            System.out.print(i + " ");
            end++;
            if (end % 10 == 0)
               System.out.println();
         } 
            
      }
   }
   public static boolean isPalindrome(int number)
   {
      int number1 = number;
      int rev = 0;
      while (number1 != 0)
      {
         int remain = number1 % 10;
         rev = rev * 10 + remain;
         number1 = number1 / 10;
      }
   
      if (number == rev)
         return true;
      else
         return false;
   
   }
   public static boolean isPrime(int number)
   {
      for (int i = 2; i < number; i++)
      {
         if (number % i == 0)
         {
            return false; 
         }
      }
      return true;     
   }
}
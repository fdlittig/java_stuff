/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    7 
Program:       3
ProgramName:   PhoneKeypad
Purpose:       Prints number corresponding to number on keypad 
Operation:     When the program is run, it prints numbers 
Input(s):      Phone number with letters
Output(s):     Corresponding numbers 
Methodology:   Scanner, if statements, boolean methods
References:
Time Spent:    20 min.
***************************************************************************/
import java.util.*;
public class PhoneKeypad
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a phone number that has letters: ");
      String pNum = input.next();
      StringBuilder newNum = new StringBuilder();
      String conversion = "";
      for (int i = 0; i < pNum.length(); i++)
      {
         if (!Character.isLetter(pNum.charAt(i)))
            newNum.append(pNum.charAt(i));
         if (Character.isLetter(pNum.charAt(i)))
            conversion = conversion.concat(Integer.toString(getNumber(pNum.charAt(i))));
      }           
      System.out.println(newNum.append(conversion));
   }
   public static int getNumber(char letter)
   {
      int number = 0;
      switch (letter)
      {
         case 'a': case 'A': case 'b': case 'B': case 'c': case 'C': number = 2;
            break;
         case 'd': case 'D': case 'e': case 'E': case 'f': case 'F': number = 3;
            break;
         case 'g': case 'G': case 'h': case 'H': case 'i': case 'I': number = 4;
            break;        
         case 'j': case 'J': case 'k': case 'K': case 'l': case 'L': number = 5;
            break;
         case 'm': case 'M': case 'n': case 'N': case 'o': case 'O': number = 6;
            break;            
         case 'p': case 'P': case 'q': case 'Q': case 'r': case 'R': case 's': case 'S': number = 7;
            break;
         case 't': case 'T': case 'u': case 'U': case 'v': case 'V': number = 8;
            break;
         case 'w': case 'W': case 'x': case 'X': case 'y': case 'Y': case 'z': case 'Z': number = 9;
            break;
      }     
      return number;
   }
}

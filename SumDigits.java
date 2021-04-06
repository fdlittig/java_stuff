/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    2 
Program:       3 
ProgramName:   SumDigits
Purpose:       Prints the sum of the digits of a given number 0-1000. 
Operation:     When the program is run, it prints a sum. 
Input(s):      Number
Output(s):     Sum of number's digits. 
Methodology:   Uses scanner print statements  
References:
Time Spent:    10 min.
***************************************************************************/
import java.util.Scanner;
public class SumDigits
{
   public static void main(String args[])
   {
      int num, digit, sum = 0;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number between 0 and 1000: ");
      num = input.nextInt();
      while(num > 0) //separates the digits of the number
      {
         digit = num % 10;
         sum = sum + digit;
         num = num / 10;
      }
      System.out.println("The sum of the digits is: " + sum);
   }
}   

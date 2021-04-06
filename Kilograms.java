/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    2 
Program:       2 
ProgramName:   Kilograms
Purpose:       To convert pounds to kilograms. 
Operation:     When the program is run, it prints a conversion. 
Input(s):      Number in pounds 
Output(s):     Same input in kilograms. 
Methodology:   Uses a formula and scanner  
References:
Time Spent:    5 min.
***************************************************************************/
import java.util.Scanner;
public class Kilograms
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number in pounds: ");
      double pounds = input.nextDouble();
   
      double kg = 0.454 * pounds;
   
      System.out.println(pounds + " pounds is " + kg + " kilograms");
   }
}

/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    2 
Program:       5 
ProgramName:   DrivingCost
Purpose:       Prints cost of driving. 
Operation:     When the program is run, it prints a number which is cost. 
Input(s):      The distance to drive, the fuel efficiency of the car in miles per gallon, and the price per gallon.
Output(s):     Cost of driving. 
Methodology:   Uses formula and scanner and print statements  
References:
Time Spent:    10 min.
***************************************************************************/
import java.util.Scanner;
public class DrivingCost
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the driving distance: ");
      double dist = input.nextDouble();
      System.out.println("Enter miles per gallon: ");
      double mpg = input.nextDouble();
      System.out.println("Enter price per gallon: ");
      double ppg = input.nextDouble();
   
      double cost = (dist / mpg) * ppg; 
   
      System.out.println("The cost of driving is $" + cost);
   }
}
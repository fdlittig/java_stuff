/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    2 
Program:       4 
ProgramName:   Distance
Purpose:       Prints distance between two coordinates. 
Operation:     When the program is run, it prints a distance. 
Input(s):      Two coordinates
Output(s):     Distance between the coordinates. 
Methodology:   Uses formula and scanner and print statements  
References:
Time Spent:    10 min.
***************************************************************************/
import java.util.Scanner;
public class Distance
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter x1 and y1: ");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      System.out.println("Enter x2 and y2: ");
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
   
      double dist = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)); //distance formula
   
      System.out.println("The distance between the two points is: " + dist);
   }
}

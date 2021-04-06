/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    6 
Program:       3
ProgramName:   TestMyTriangle
Purpose:       Finds area of a triangle
Operation:     When the program is run, it calculates area
Input(s):      Coordinates of points for the sides
Output(s):     Area
Methodology:   Uses Heron's formula  
References:    
Time Spent:    10 min.
**************************************************************************/
import java.util.*;
public class TestMyTriangle
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter x1:\t");
      double x1 = input.nextDouble();
      System.out.print("Enter y1:\t");
      double y1 = input.nextDouble();
      System.out.print("Enter x2:\t");
      double x2 = input.nextDouble();
      System.out.print("Enter y2:\t");
      double y2 = input.nextDouble();
      System.out.print("Enter x3:\t");
      double x3 = input.nextDouble();
      System.out.print("Enter y3:\t");
      double y3 = input.nextDouble();
      
      double side1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
      double side2 = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
      double side3 = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
    
      if (MyTriangle.isValid(side1, side2, side3) == true)
         System.out.println(Math.round(MyTriangle.area(side1, side2, side3)*1000d) / 1000d);
      else
         System.out.println("Invalid side lengths");
   }
}
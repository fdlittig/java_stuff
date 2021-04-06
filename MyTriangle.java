/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    6 
Program:       3
ProgramName:   MyTriangle
Purpose:       Finds area of a triangle
Operation:     When the program is run, it calculates area
Input(s):      Side lengths from TestMyTriangle
Output(s):     None
Methodology:   Uses Heron's formula  
References:    
Time Spent:    10 min.
**************************************************************************/
import java.util.*;
public class MyTriangle
{
   public static boolean isValid(double side1, double side2, double side3)
   {
      if ((side1 + side2) > side3 || (side1 + side3) > side2 || (side2 + side3) > side1)
         return true;
      else
         return false;
   }
   public static double area(double side1, double side2, double side3)
   {
      double S = (side1 + side2 + side3) / 2;
      double area = Math.sqrt(S*(S - side1)*(S - side2)*(S - side3));
      return area;
   }
}
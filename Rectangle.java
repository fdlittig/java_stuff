/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    10 
Program:       1
ProgramName:   Rectangle
Purpose:       Defines class Rectangle 
Operation:     Defines methods, variables in class Rectangle
Input(s):      From TestRectangle
Output(s):     None
Methodology:   Classes and objects
References:
Time Spent:    15 min.
***************************************************************************/
public class Rectangle
{
   double width;
   double height;
   
   Rectangle()
   {
      width = 1;
      height = 1;
   }
   Rectangle(double newWidth, double newHeight)
   {
      width = newWidth;
      height = newHeight;
   }
   double getWidth()
   {
      return width;
   }
   double getHeight()
   {
      return height;
   }
   double getArea()
   {
      return width * height;
   }
   double getPerimeter()
   {
      return (2 * width) + (2 * height);
   }
}
     

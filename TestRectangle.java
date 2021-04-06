/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    10 
Program:       1
ProgramName:   TestRectangle
Purpose:       Creates objects of class Rectangle 
Operation:     Instantiates objects
Input(s):      Width and height of rectangle
Output(s):     Width, height, area, & perimeter
Methodology:   Classes and objects
References:    
Time Spent:    15 min.
***************************************************************************/
public class TestRectangle
{
   public static void main (String[] args)
   {
      Rectangle r1 = new Rectangle(4, 40);
      System.out.println("Width: " + r1.getWidth());
      System.out.println("Height: " + r1.getHeight());
      System.out.println("Area: " + r1.getArea());
      System.out.println("Perimeter: " + r1.getPerimeter() + "\n");
     
      Rectangle r2 = new Rectangle(3.5, 35.9);
      System.out.println("Width: " + r2.getWidth());
      System.out.println("Height: " + r2.getHeight());
      System.out.println("Area: " + r2.getArea());
      System.out.println("Perimeter: " + r2.getPerimeter() + "\n");
   
      Rectangle r3 = new Rectangle();
      r3.width = 10;
      r3.height = 17;
      System.out.println("Width: " + r3.getWidth());
      System.out.println("Height: " + r3.getHeight());
      System.out.println("Area: " + r3.getArea());
      System.out.println("Perimeter: " + r3.getPerimeter());
   }
}

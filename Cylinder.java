/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    2 
Program:       1 
ProgramName:   Cylinder 
Purpose:       To print out area and volume of a cylinder. 
Operation:     When the program is run, it outputs print statements. 
Input(s):      Length and radius
Output(s):     Area and volume of cylinder. 
Methodology:   Uses scanner and several print-line statements  
References:
Time Spent:    5 min.
***************************************************************************/ 
import java.util.Scanner;
public class Cylinder
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a length: ");
      double length = input.nextDouble();
      System.out.println("Enter a radius: ");
      double radius = input.nextDouble();
   
      double area = radius * radius * 3.14159; //cross-secitonal area
      double volume = area * length;
   
      System.out.println("The area is " + area);
      System.out.println("The volume is " + volume);
   }
}
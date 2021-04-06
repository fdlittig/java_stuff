/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    1 
Program:       1 
ProgramName:   HelloWorld 
Purpose:       To print out information about the coder. 
Operation:     When the program is run, it prompts the user for the user’s name 
               and then prints a hello message using the information the user input. 
Input(s):      User’s name (as String) 
Output(s):     A hello message including the input from the user 
Methodology:   Request input and print a  
               hello message which includes the input provided by the user.  
References:
Time Spent:    5 min.
***************************************************************************/
import java.util.Scanner;

public class HelloWorld
{
   public static void main (String[] args)
   {
      Scanner s = new Scanner(System.in);
      String name;
   
      System.out.print("Please enter your name: ");
      name = s.nextLine();
      System.out.println("Hello " + name + "!");
   }
}
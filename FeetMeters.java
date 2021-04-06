/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    7 
Program:       1 
ProgramName:   FeetMeters
Purpose:       Prints a conversion table. 
Operation:     When the program is run, it prints a table. 
Input(s):      None
Output(s):     Table of feet & meter conversions 
Methodology:   Printf
References:
Time Spent:    10 min.
***************************************************************************/
import java.util.*;
public class FeetMeters
{
   public static void main (String[] args)
   {
      String f = "Feet";
      String m = "Meters";
      System.out.printf("%5s%10s | %5s%9s\n",f, m, m, f);
      for (double feet = 1, meters = 20; feet <= 10; feet++, meters += 5)
      {
         System.out.printf("%5.2f%10.3f | %5.2f%10.3f\n", feet, footToMeter(feet),
                       meters, meterToFoot(meters));
      }
   }
   public static double footToMeter(double foot)
   {
      return 0.305 * foot;
   }
   public static double meterToFoot(double meter)
   { 
      return 3.281 * meter;
   }
}

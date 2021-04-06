/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    6 
Program:       1
ProgramName:   InvestmentValue
Purpose:       Finds value of investment over 30 years 
Operation:     When the program is run, it prints a table
Input(s):      Amount invested and interest rate
Output(s):     Table of future value over 30 years
Methodology:   Uses for loops  
References:    
Time Spent:    10 min.
**************************************************************************/
import java.util.*;
public class InvestmentValue
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      System.out.print("Amount invested: ");
      double investmentAmount = input.nextDouble();
   
      System.out.print("Annual interest rate: ");
      double annualInterestRate = input.nextDouble() / 100;
         
      System.out.printf("%3s%20s\n", "Years", "Future Value");
      for (int i = 1; i <= 30; i++) 
      {
         System.out.printf("%-4d%20.2f\n", i, futureInvestmentValue(investmentAmount, annualInterestRate / 12, i));
      }
   }
   public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,
                                              int years)
   {
      return investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
   }
}
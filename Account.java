/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    10 
Program:       2
ProgramName:   Account
Purpose:       Defines class Account 
Operation:     Defines methods, variables in class Account
Input(s):      From TestAccount
Output(s):     None
Methodology:   Classes and objects
References:    
Time Spent:    15 min.
***************************************************************************/
import java.util.*;
import java.text.NumberFormat;
public class Account
{
   private int id;
   private double balance;
   private double annualInterestRate;
   private Date dateCreated;
    
   Account() //default constructor allows for object creation w/o parameters
   {
      id = 0;
      balance = 0;
      annualInterestRate = 0;
   }
   Account(int newId, double initialBalance, double newRate)
   {
      id = newId;
      balance = initialBalance;
      annualInterestRate = newRate;
   }
   void setID(int accID)
   {
      id = accID;
   }
   void setBalance(double initialBalance)
   {
      balance = initialBalance;
   }
   void setAnnualInterestRate(double newRate)
   {
      annualInterestRate = newRate;
   }
   double getMonthlyInterestRate()
   {
      return Math.round((annualInterestRate / 12) * 100d) / 100d;
   }
   double getMonthlyInterest()
   {
      return Math.round((balance * (getMonthlyInterestRate() / 100)) * 100d) / 100d;
   }
   Date getDateCreated()
   {
      dateCreated = new Date();
      return dateCreated;
   }
   String getBalance()
   {
      NumberFormat b = NumberFormat.getCurrencyInstance();
      return b.format(balance);
   }
   void withdraw(double amount)
   {
      balance -= amount;
   }
   void deposit(double amount)
   {
      balance += amount;
   }
   public String toString()
   {
      NumberFormat f = NumberFormat.getCurrencyInstance();
      return "Account ID:\t\t\t" + id + "\n" + "Account Balance:\t" +
             f.format(balance) + "\n" + "Interest Rate:\t\t" + annualInterestRate 
             + "%" + "\n" + "Date Opened:\t\t" + dateCreated;
   }
}
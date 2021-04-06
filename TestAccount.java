/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    10 
Program:       2
ProgramName:   TestAccount
Purpose:       Creates objects of class Account 
Operation:     Instantiates objects
Input(s):      Account ID, balance, annual interest rate
Output(s):     Balance, monthly interest rate, account creation date
Methodology:   Classes and objects
References:    
Time Spent:    15 min.
***************************************************************************/
import java.util.Date;
public class TestAccount
{
   public static void main (String[] args)
   {
      Account acc1 = new Account(1122, 20000, 4.5);
      acc1.getDateCreated();
      acc1.withdraw(2500);
      acc1.deposit(3000);
      System.out.println(acc1 + "\n");
      
      Account myAccount = new Account(1123, 47500, 3.1);
      myAccount.getDateCreated();
      System.out.println(myAccount);
      System.out.println("Monthly interest rate: " + myAccount.getMonthlyInterestRate() + "%");
      System.out.println("Monthly interest: " + myAccount.getMonthlyInterest());
      myAccount.withdraw(25653);
      System.out.println("New balance after withdrawl:\t" + myAccount.getBalance());
      myAccount.deposit(9360.68);
      System.out.println("New balance after deposit:\t" + myAccount.getBalance() + "\n");
      
      Account yourAccount = new Account();
      yourAccount.setID(1124);
      yourAccount.setBalance(21580);
      yourAccount.setAnnualInterestRate(2.9);
      yourAccount.getDateCreated();
      System.out.println(yourAccount);
      System.out.println("Monthly interest rate: " + yourAccount.getMonthlyInterestRate() + "%");
      System.out.println("Monthly interest: " + yourAccount.getMonthlyInterest());
      yourAccount.withdraw(1580);
      System.out.println("New balance after withdrawl:\t" + yourAccount.getBalance());
      yourAccount.deposit(12365);
      System.out.println("New balance after deposit:\t" + yourAccount.getBalance());
   }
}
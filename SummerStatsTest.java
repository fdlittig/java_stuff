import java.util.*;
public class SummerStatsTest
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner (System.in);
      System.out.print("Enter # of people and # of years: ");
      int ppl = input.nextInt();
      int yrs = input.nextInt();
      
      SummerStats m1 = new SummerStats(ppl, yrs);
      System.out.println(m1.toString());
      System.out.println("Index of person who is richest: ");
      System.out.println("Index of year of highest salary: " +
                         m1.yearHighestSalary());
                         
      System.out.print("Enter a person (row index): ");
      int person = input.nextInt();
      System.out.println("Total amount of money made by person " + person + ": $"
                         + m1.moneyForPerson(person));
      System.out.println("Total amount of money made by everyone: $"
                          + m1.totalMoney());
                          
      System.out.print("Enter a year (column index): ");
      int yr = input.nextInt();
      System.out.println("Index of person who made highest salary in year " + yr + ": "
                         + m1.givenYearHighestSalary(yr));
      System.out.println("Average salary for each year: " 
                         + Arrays.toString(m1.yearlyAverageSalary(yrs)));
      System.out.println("Sorted salaries: " + Arrays.deepToString(m1.sortedEarnings()));
   }
}
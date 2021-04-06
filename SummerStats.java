import java.util.*;
public class SummerStats
{
   private double[][] salaries;
   
   SummerStats(int people, int years)
   {
      salaries = new double[people][years];
      for (int i = 0; i < salaries.length; i++)
      { 
         for (int k = 0; k < salaries[i].length; k++)
            salaries[i][k] =
               Math.round((1000 + (Math.random() * 4000)) * 100d) / 100d;
      }   
   }
   
   String getRichest()
   {
      double[] largestCol = salaries[0];
      double[] tempLargestCol = salaries[0];
      for (int i = 0; i < salaries.length; i++)
      {
         for (int k = 0; k < salaries[i].length; k++)
         {
            tempLargestCol = salaries[i];
            largestCol = salaries[0];
            if ((tempLargestCol[k]+=tempLargestCol[k]) > (largestCol[k]+=largestCol[k]))
               largestCol = tempLargestCol;
         }
      }
      return Integer.toString(Arrays.asList(salaries).indexOf(largestCol));
   }
   
   String yearHighestSalary()
   {
      String person = "";
      String year = "";
      double max = salaries[0][0];
      for (int i = 0; i < salaries.length; i++)
      {
         for (int k = 0; k < salaries[i].length; k++)
         {
            if (salaries[i][k] > max)
            {
               max = salaries[i][k];
               person = Integer.toString(i);
               year = Integer.toString(k);
            }
         }
      }
      return "[" + person + ", " + year + "]";
   }
   
   double moneyForPerson(int person)
   {
      double sum = 0;
      for (int i = 0; i < salaries.length; i++)
      {
         for (int k = 0; k < salaries[i].length; k++)
            sum += salaries[person][k];
      }
      return Math.round(sum * 100d) / 100d;
   } 
   
   double totalMoney()
   {
      double sum = 0;
      for (int i = 0; i < salaries.length; i++)
      {
         for (int k = 0; k < salaries[i].length; k++)
            sum += salaries[i][k];
      }
      return Math.round(sum * 100d) / 100d;
   }
   
   String givenYearHighestSalary(int year)
   {
      String person = "";
      double max = salaries[0][year];
      for (int i = 0; i < salaries.length; i++)
      {
         for (int k = 0; k < salaries[i].length; k++)
         {
            if (salaries[i][year] > max)
            {
               max = salaries[i][year];
               person = Integer.toString(i);
            }
         } 
      }
      return "[" + person + ", " + year + "]";
   }
   
   double[] yearlyAverageSalary(int year)
   {
      double[] averages = new double[year];
      for (int i = 0; i < salaries.length; i++)
      {
         for (int k = 0; k < salaries[i].length; k++)
            averages[i] += (salaries[i][k] / i);
         
      }
      return averages;
   } 
   
   double[][] sortedEarnings()
   {
      for (int i = 0; i < salaries.length; i++)
      {
         for (int k = 0; k < salaries[i].length; k++)
         {
            Arrays.sort(salaries[i]);
         }
      }
      return salaries;
   }
   
   public String toString()
   {
      return Arrays.deepToString(salaries);     
   }
}
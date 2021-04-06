/************************************************************************** 
Class:         CS1301 Section 03
Term:          Fall 2017 
Name:          Francis Littig 
Instructor:    Apeksha Ponna
Assignment:    6 
Program:       4
ProgramName:   CrapsGame
Purpose:       Plays Craps
Operation:     When the program is run, it plays a game
Input(s):      Dice roll
Output(s):     Win/lose
Methodology:   Uses if statements, for loop  
References:    
Time Spent:    30 min.
**************************************************************************/
import java.util.*;
public class CrapsGame
{
   public static void main (String[] args)
   {
      int roll1 = rollDie();
      int roll2 = rollDie();
      int score = addDice(roll1, roll2);
      int p = 0;
      System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + score);
      if (score == 7 || score == 11)
         System.out.println("You win");
      else if (score == 2 || score == 3 || score == 12)
         System.out.println("You lose");
      else
      {
         p += score;
         System.out.println("point is " + p);
         for (int i = 0; i <= 10000; i++) //keeps looping & rolling dice                                 
         {                                //until score equals 7 or the first score
            int roll3 = rollDie();
            int roll4 = rollDie();
            score = addDice(roll3, roll4);
            if (score == 7)
            {
               System.out.println("You rolled " + roll3 + " + " + roll4 + " = " + score);
               System.out.println("You lose");
               break;
            }
            if (score == p)
            {
               System.out.println("You rolled " + roll3 + " + " + roll4 + " = " + score);
               System.out.println("You win");
               break;
            }
         }
      }  
   }
   public static int rollDie()
   {
      Random rand = new Random();
      int die = rand.nextInt(6) + 1;
               
      return die;
   }
   public static int addDice(int die1, int die2)
   {
      int score = die1 + die2;
      return score;
   }
}
//Author:      Nick Seyler
//Date:        Mar 19, 2015
//Description: Simulates a game of craps.

public class CrapsGame
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables
      int roll = rollDice();
      if (roll == 2 || roll == 3 || roll == 12) //loss
      {
         System.out.println("You lose");
      }
      else if (roll == 7 || roll == 11) //win
      {
         System.out.println("You win");
      }
      else
      {
         System.out.println("point is " + roll); //point is established
         int point = roll;
         roll = 0;
         while (point != roll)
         {
            roll = rollDice();
            if (roll == 7)
            {
               System.out.println("You lose"); //loss after point established
               break;
            }
            else if (point == roll)
            {
               System.out.println("You win"); //win after point established
            }
         }
      }
   }
   
   //simulate rolling two six-sided dice
   public static int rollDice()
   {
      int roll1 = (int)((Math.random() * 6) + 1); //roll between 1-6
      int roll2 = (int)((Math.random() * 6) + 1); //roll between 1-6
      int total = roll1 + roll2;
      System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + total); 
      return total;
   }
}

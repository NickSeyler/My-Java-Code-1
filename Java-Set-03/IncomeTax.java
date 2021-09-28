//Author:      Nick Seyler
//Date:        Feb 4, 2015
//Description: Asks the user for his annual income, then tells his tax bracket.

import java.util.Scanner;

public class IncomeTax
{
   public static void main (String [] args)
   {
      run();
   }
   
   public static void run()
   {
      int income = getIncome();
      sayTaxBracket(income);
   }
   
   //user input
   public static int getIncome()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      int income;
      
      //get user input
      System.out.print("Enter your annual income: $");
      income = input.nextInt();
      input.close();
      
      //return an integer
      return income;
   }
   
   //tells the user's tax bracket
   public static void sayTaxBracket(int income)
   {
      //restates user's income
      System.out.println("Your annual income is: $" + income);
      
      //checks and states user's tax bracket
      if (income <= 50000)
      {
         System.out.println("Your tax bracket is 5%.");
      }
      else if (income <= 100000)
      {
         System.out.println("Your tax bracket is 15%.");
      }
      else if (income <= 150000)
      {
         System.out.println("Your tax bracket is 20%.");
      }
      else if (income <= 250000)
      {
         System.out.println("Your tax bracket is 30%.");
      }
      else if (income <= 500000)
      {
         System.out.println("Your tax bracket is 35%.");
      }
      else
      {
         System.out.println("Your tax bracket is 50%.");
      }
      
   }
}
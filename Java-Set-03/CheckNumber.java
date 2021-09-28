//Author:      Nick Seyler
//Date:        Feb 4, 2015
//Description: Asks the user for a number, then tells whether the number is positive, negative, or zero.

import java.util.Scanner;

public class CheckNumber
{
   public static void main (String [] args)
   {
      run();
   }
   
   public static void run()
   {
      int num = getNum();
      checkNum(num);
   }
   
   //user input
   public static int getNum()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      int num;
      
      //get user input
      System.out.print("Enter an integer: ");
      num = input.nextInt();
      input.close();
      
      //return an integer
      return num;
   }
   
   //checks if num is positive, negative, or zero
   public static void checkNum(int num)
   {
      if (num == 0)
      {
         System.out.println("The number is zero.");
      }
      else if (num > 0)
      {
         System.out.println("The number is positive.");
      }
      else if (num < 0)
      {
         System.out.println("The number is negative.");
      }
   }
}
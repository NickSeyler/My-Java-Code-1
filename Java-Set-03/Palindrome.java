//Author:      Nick Seyler
//Date:        Feb 4, 2015
//Description: Asks the user for a three-digit integer and determines if it is a palindrome.

import java.util.Scanner;

public class Palindrome
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      int num = getNum();
      checkPalindrome(num);
   }
   
   public static int getNum()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      int num;
      //get user input
      System.out.print("Enter a three-digit integer: ");
      num = input.nextInt();
      input.close();
      
      //return an integer
      return num;
   }
   
   public static void checkPalindrome(int num)
   {
      //declare and assign variables
      int digit1 = num / 100;
      int digit3 = num % 10;
      
      if (digit1 == digit3)
      {
         System.out.println(num + " is a palindrome.");
      }
      else
      {
         System.out.println(num + " is not a palindrome.");
      }
      
   }
}
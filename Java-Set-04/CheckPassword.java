//Author:      Nick Seyler
//Date:        Mar 24, 2015
//Description: Checks a string for a valid password.

import java.util.Scanner;

public class CheckPassword
{
   public static void main(String [] args)
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      //user input
      System.out.print("Enter a password: ");
      String pass = input.nextLine();
      input.close();
      
      if (checkEightChars(pass) && checkLettersAndDigits(pass) && checkTwoDigits(pass))
         System.out.println("Valid Password");
      else
         System.out.println("Invalid Password");

   }
   
   //checks if the password is at least eight characters
   public static boolean checkEightChars(String pass)
   {
      if (pass.length() >= 8)
         return true;
      else
         return false;
   }
   
   //checks if the password is made of only letters and digits
   public static boolean checkLettersAndDigits(String pass)
   {
      for (int i = 0; i < pass.length(); i++)
      {
         if (!Character.isLetterOrDigit(pass.charAt(i)))
            return false;
      }
      
      return true;
   }
   
   //checks if the password is made of at least two digits
   public static boolean checkTwoDigits(String pass)
   {
      int count = 0;
      for (int i = 0; i < pass.length(); i++)
      {
         if (Character.isDigit(pass.charAt(i)))
            count++;
      }
      
      if (count >= 2)
         return true;
      else
         return false;
   }
}

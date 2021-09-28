//Author:      Nick Seyler
//Date:        Mar 9, 2015
//Description: Check for valid password entry.

import java.util.Scanner;

public class PasswordTest
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      String pass;
      int stringNum = 0;
      
      //user input
      System.out.print("Enter a password:\t");
      pass = input.nextLine();
      input.close();
      
      if (pass.length() < 8)
      {
         System.out.println("Verdict:\t\tInvalid");
      }
      else
      {
         while (stringNum < pass.length()) //continues if the stringNum of initial value 0 is less than the length of the string
                                           //calculation for the string length is one more than the stringNum value
         {     
            if (Character.isLowerCase(pass.charAt(stringNum))) //is a lowercase letter
            {
               stringNum = 0;
               break; //end this loop, check next qualifier
            }
            else //not a lowercase letter
            {
               stringNum++;
            }
            
         }
         
         while (stringNum < pass.length()) //continues if the stringNum of initial value 0 is less than the length of the string
                                           //calculation for the string length is one more than the stringNum value
         {
            if (Character.isUpperCase(pass.charAt(stringNum))) //is an uppercase letter
            {
               stringNum = 0;
               break; //end this loop, check next qualifier
            }
            else //not a lowercase letter
            {
               stringNum++;
            }

         }
         
         while (stringNum < pass.length()) //continues if the stringNum of initial value 0 is less than the length of the string
                                           //calculation for the string length is one more than the stringNum value
         {
            if (Character.isDigit(pass.charAt(stringNum))) //is a number
            {
               stringNum = 0;
               break; //end this loop, check next qualifier
            }
            else //not a lowercase letter
            {
               stringNum++;
            }

         }
         
         while (stringNum < pass.length()) //continues if the stringNum of initial value 0 is less than the length of the string
                                           //calculation for the string length is one more than the stringNum value
         {
            if (!Character.isLetterOrDigit(pass.charAt(stringNum))) //is a special character
            {
               System.out.println("Verdict:\t\tValid"); //output
               break; //end this loop
            }
            else //not a lowercase letter
            {
               stringNum++;
            }

         }

         
         if (stringNum == pass.length()) //at least one qualifier is not met
         {
            System.out.println("Verdict:\t\tInvalid");
         }
      }
   }
}
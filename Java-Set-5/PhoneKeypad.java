//Author:      Nick Seyler
//Date:        Mar 26, 2015
//Description: Converts a phone number with mapped letters and numbers to numbers.

import java.util.Scanner;

public class PhoneKeypad
{
   public static void main(String [] args)
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      
      //user input
      System.out.print("Enter a string: ");
      String phone = input.nextLine();
      input.close();
      
      //checks all characters
      for(int i = 0; i < phone.length(); i++)
      {
         if (!Character.isLetter(phone.charAt(i)))
            System.out.print(phone.charAt(i));
         else
         {
            int num = getNumber(Character.toUpperCase(phone.charAt(i)));
            System.out.print(num);
         }
      }
   }
   
   //return a number that corresponds to a character
   public static int getNumber(char uppercaseLetter)
   {
      if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C')
         return 2;
      else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F')
         return 3;
      else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I')
         return 4;
      else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L')
         return 5;
      else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O')
         return 6;   
      else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S')
         return 7;
      else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V')
         return 8;
      else if (uppercaseLetter == 'W' || uppercaseLetter == 'X' || uppercaseLetter == 'Y' || uppercaseLetter == 'Z')
         return 9;
      else
         return 0; //dummy return statement; will never occur
   }
}
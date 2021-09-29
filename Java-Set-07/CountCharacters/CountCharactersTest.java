//Author:      Nick Seyler
//Date:        September 21, 2015
//Description: Tests CountCharacters.

import java.util.Scanner;

public class CountCharactersTest
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a String: ");
      String s = input.nextLine();
      System.out.print("Enter a character: ");
      char c = input.nextLine().charAt(0);
      input.close();
      
      System.out.println("The amount of occurences of " + c + " in " + s + " is " + CountCharacters.count(s, c));
   }
}

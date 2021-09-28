//Author:      Nick Seyler
//Date:        Feb 12, 2015
//Description: Various examples of string methods.

import java.util.Scanner;

public class StringMethods
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      String string_1, string_2;
      
      //user input
      System.out.print("Enter String 1: ");
      string_1 = input.nextLine();
      System.out.print("Enter String 2: ");
      string_2 = input.nextLine();
      input.close();
      
      //output
      System.out.println("The length of the first string is:\t" + string_1.length());          //A) Determine the length of String 1
      System.out.println("The length of the second string is:\t" + string_2.length());         //B) Determine the length of String 2
      System.out.println("The concatenation of the string is:\t" + string_1.concat(string_2)); //C) Concatenate the two strings
      System.out.println("The two strings are the same:\t\t" + string_1.equals(string_2));     //D) Determine if the two strings are equal
      System.out.println("String 1 converts to uppercase: \t" + string_1.toUpperCase());       //E) Convert String 1 to uppercase
      System.out.println("String 2 converts to lowercase: \t" + string_2.toLowerCase());       //F) Convert String 2 to lowercase
      System.out.println("A substring of String 1 is: \t\t" + string_1.substring(0,2));        //G) Create a substring from String 1
   }
}
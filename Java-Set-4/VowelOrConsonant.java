//Author:      Nick Seyler
//Date:        Feb 18, 2015
//Description: Checks if a letter is a vowel or constant.

import java.util.Scanner;

public class VowelOrConsonant
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      char ch;
      
      //user input
      System.out.print("Enter a character: ");
      ch = input.nextLine().charAt(0);
      input.close();
      
      switch(ch)
      {
         case  'a':
         case  'e':
         case  'i':
         case  'o':
         case  'u':
         case  'A':
         case  'E':
         case  'I':
         case  'U': System.out.println(ch + " is a vowel"); break;
         case  'b': 
         case  'c': 
         case  'd':
         case  'f':
         case  'g':
         case  'h':
         case  'j':
         case  'k':
         case  'l':
         case  'm':
         case  'n':
         case  'p':
         case  'q':
         case  'r':
         case  's':
         case  't':
         case  'v':
         case  'w':
         case  'x':
         case  'y':
         case  'z':
         case  'B':
         case  'C':
         case  'D':
         case  'F':
         case  'G':
         case  'H':
         case  'J':
         case  'K':
         case  'L':
         case  'M':
         case  'N':
         case  'P':
         case  'Q':
         case  'R':
         case  'S':
         case  'T':
         case  'V':
         case  'W':
         case  'X':
         case  'Y':
         case  'Z': System.out.println(ch + " is a consonant"); break;
         default: System.out.println(ch + " is an invalid input"); break;
      }
   }
}
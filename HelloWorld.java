// Name:        Nick Seyler
// Term:        Spring 2015
// Description: Prints a message after entering a name.

import java.util.Scanner;

public class HelloWorld
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Please enter your name: ");
      String name = s.nextLine();
      System.out.println("Hello " + name + "!");
      s.close();
   }
}
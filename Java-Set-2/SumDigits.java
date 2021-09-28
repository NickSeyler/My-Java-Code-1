// Name:        Nick Seyler
// Term:        Spring 2015
// Description: Get the user input of a 3-digit, 2-digit, or 1-digit integer, and then calculate the sum of the digits.

import java.util.Scanner;

public class SumDigits
{
   public static void main (String [] args)
   {
      run();  
   }
   
   public static void run()
   {
      //declare and assign variables from methods
      int num = getUserInput();
      
      //other methods
      calculate(num);
   }
   
   public static int getUserInput()
   {
      //declare and assign variable
      Scanner input = new Scanner(System.in);
      int num;
      
      //get user input
      System.out.print("Enter a number between 0 and 999: ");
      num = input.nextInt();
      input.close();
      
      //return an int value
      return num;
   }
   
   public static void calculate(int num1)
   {
      //declare and assign variables through formulas
      int digit1 = num1 % 10;
      int num2 = num1 / 10;
      int digit2 = num2 % 10;
      int digit3 = num2 / 10;
      int sum = digit1 + digit2 + digit3;
      
      System.out.println("The sum of the digits is " + sum);
   }
}
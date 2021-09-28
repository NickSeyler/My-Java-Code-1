// Name:        Nick Seyler
// Term:        Spring 2015
// Description: Get the user input of pounds, then convert it to kilograms.

import java.util.Scanner;

public class Kilograms
{
   public static void main(String args[])
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables from methods
      float pounds = getPounds();
      
      //call other methods
      poundsToKilograms(pounds);
   }
   
   public static float getPounds()
   {
      //declare and assign variables 
      Scanner input = new Scanner(System.in);
      float pounds;
      
      //get user input
      System.out.println("Enter a number in pounds: ");
      pounds = input.nextFloat();
      input.close();
      
      //return a float value
      return pounds;
      
   }
   
   public static void poundsToKilograms(float pounds)
   {
      //declare and assign variables with formulas
      float kilograms = pounds * (float)0.454;
      
      //output
      System.out.println(pounds + " pounds is " + kilograms + " kilograms");
      
   }
}
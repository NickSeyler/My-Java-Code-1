// Name:        Nick Seyler
// Term:        Spring 2015
// Description: Get the user input of driving distance, miles per gallon, and price per gallon, then display the cost of driving.

import java.util.Scanner;

public class DrivingCost
{
   public static void main(String [] args)
   {
      run();
   }

   public static void run()
   {
      //declare and assign variables from methods
      float distance = getDrivingDistance();
      float mpg = getMilesPerGallon();
      float ppg = getPricePerGallon();
      
      //other methods
      calculate(distance, mpg, ppg);
   }
   
   public static float getDrivingDistance()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      float distance;
      
      //get user input
      System.out.print("Enter the driving distance in miles: ");
      distance = input.nextFloat();
      
      //return a float value
      return distance;
   }
   
   public static float getMilesPerGallon()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      float mpg;
      
      //get user input
      System.out.print("Enter miles per gallon: ");
      mpg = input.nextFloat();
      
      //return a float value
      return mpg;
   }
   
   public static float getPricePerGallon()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      float ppg;
      
      //get user input
      System.out.print("Enter price per gallon: $");
      ppg = input.nextFloat();
      input.close();
      
      //return a float value
      return ppg;
   }
   
   public static void calculate(float distance, float mpg, float ppg)
   {
      //declare and assign variables with formulas
      float gallons = distance / mpg;
      float cost = gallons * ppg;
      
      //round money to two decimal places
      int costDollar = (int)cost;
      float costCent = cost % costDollar * 100;
      
      //output
      System.out.println("The cost of driving is $" + costDollar + "." + Math.round(costCent));
   }
}
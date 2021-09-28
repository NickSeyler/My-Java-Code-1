// Name:        Nick Seyler
// Term:        Spring 2015
// Description: Get the user input of two points, then displays the distance between them.

import java.util.Scanner;

public class Distance
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      float x1, x2, y1, y2;
      double distance;
      
      //get user input
      System.out.println("Enter the first point (x1 and y1): ");
      x1 = input.nextFloat();
      y1 = input.nextFloat();
      System.out.println("Enter the second point (x2 and y2): ");
      x2 = input.nextFloat();
      y2 = input.nextFloat();
      input.close();
      
      //calculate and display distance
      distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
      System.out.println("The distance between the two points is " + distance);
   }
}
//Author: Nick Seyler
//Date: Jan 27, 2015
//Description: Gets the user input of three integers and displays the average.

import java.util.Scanner;

public class Average
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      getInputAndCalculateAverage();
   }
   
   public static void getInputAndCalculateAverage()
   {
      //declaration and assignment
      Scanner input = new Scanner(System.in);
      int x, y, z;
      double average;
      
      //user input
      System.out.println("Type three integers: ");
      x = input.nextInt();
      y = input.nextInt();
      z = input.nextInt();
      input.close();
      
      //calculate average
      average = (double)(x + y + z) / 3;
      
      //output
      System.out.println("X = " + x);
      System.out.println("Y = " + y);
      System.out.println("Z = " + z);
      System.out.println("The average of these three numbers is: " + average);
      
   }
}
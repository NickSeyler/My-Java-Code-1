// Name:        Nick Seyler
// Term:        Spring 2015
// Description: Get the user input of the length and radius of a cylinder, then calculate the area and volume.

import java.util.Scanner;

public class Cylinder
{
   public static void main (String args[])
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables via calling methods
      float radius = getRadius();
      float length = getLength();
      
      //other methods to call
      calculate(radius, length);
   }
   
   public static float getRadius()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      float radius;
      
      //get user input
      System.out.println("Enter the radius of the cylinder: ");
      radius = input.nextFloat();
      input.close();
      
      //return a float value
      return radius;
   }
   
   public static float getLength()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      float length;
      
      //get user input
      System.out.println("Enter the length of the cylinder: ");
      length = input.nextFloat();
      input.close();
      
      //return a float value
      return length;
   }
   
   public static void calculate(float radius, float length)
   {
      //declare and assign variables
      float area = radius * radius * (float)(Math.PI);
      float volume = area * length;
      
      //output
      System.out.println("The area is " + area);
      System.out.println("The volume is " + volume);
   }
   
}
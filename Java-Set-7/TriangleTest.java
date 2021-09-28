//Author:      Nick Seyler
//Date:        September 8, 2015
//Description: Test GeometricObject and Triangle

import java.util.Scanner;

public class TriangleTest
{
   public static void main(String[] args)
   {
      double s1, s2, s3;
      String color;
      int f;
      boolean filled = false;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first side length: ");
      s1 = input.nextDouble();
      System.out.print("Enter the second side length: ");
      s2 = input.nextDouble();
      System.out.print("Enter the third side length: ");
      s3 = input.nextDouble();
      System.out.print("What color is it?: ");
      color = input.next();
      System.out.print("Is the shape filled (0 = no, 1 = yes)?: ");
      f = input.nextInt();
      input.close();
      
      Triangle t = new Triangle(s1, s2, s3);
      t.setColor(color);
      
      if (f == 0)
         filled = false;
      else
         filled = true;
         
      t.setFilled(filled);
      

      System.out.println();
      System.out.println(t); //automatically invokes toString from object
      System.out.println("Area = " + t.getArea() + ", Perimeter = " + t.getPerimeter());
   }
}
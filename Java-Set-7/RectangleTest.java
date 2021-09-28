//Author:      Nick Seyler
//Date:        Apr 23, 2015
//Description: Tests the Rectangle class by calling its methods and constructors.

public class RectangleTest
{
   public static void main(String [] args)
   {
      Rectangle r1 = new Rectangle(4, 40);
      System.out.println("Width of r1 = " + r1.width);
      System.out.println("Height of r1 = " + r1.height);
      System.out.println("Area of r1 = " + r1.getArea());
      System.out.println("Perimeter of r1 = " + r1.getPerimeter());
      System.out.println();
      
      Rectangle r2 = new Rectangle(3.5, 35.9);
      System.out.println("Width of r2= " + r2.width);
      System.out.println("Height of r2 = " + r2.height);
      System.out.println("Area of r2 = "+ r2.getArea());
      System.out.println("Perimeter of r2 = " + r2.getPerimeter());
      System.out.println();
   }
}
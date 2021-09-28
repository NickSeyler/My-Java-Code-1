//Author:      Nick Seyler
//Date:        Apr 28, 2015
//Description: Tests the LinearEquation class.
import java.util.Scanner;

public class LinearEquationTest
{
   public static void main(String [] args)
   {
      double a, b, c, d, e, f;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter 6 values for a, b, c, d, e, and f, respectively: ");
      a = input.nextDouble();
      b = input.nextDouble();
      c = input.nextDouble();
      d = input.nextDouble();
      e = input.nextDouble();
      f = input.nextDouble();
      input.close();
      
      LinearEquation linEq1 = new LinearEquation(a, b, c, d, e, f);
      if (!linEq1.isSolvable())
         System.out.println("This equation has no solution.");
      else
      {
         System.out.println("X = " + linEq1.getX());
         System.out.println("Y = " + linEq1.getY());
      }
   }
}

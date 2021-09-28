//Author:      Nick Seyler
//Date:        Feb 18, 2015
//Description: Various math methods

import java.util.Scanner;

public class MathMethods
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign Scanner
      Scanner input = new Scanner(System.in);
      
      // A) Absolute value of a negative number
      System.out.print("Enter a negative integer: \t");
      int negInt = input.nextInt();
      System.out.println("The absolute value is: \t\t" + Math.abs(negInt));
      System.out.println();
      
      // B) An angle's sine, cosine, and tangent values
      System.out.print("Enter a floating-point angle: \t");
      float angle = input.nextFloat();
      System.out.println("The sine is: \t\t\t" + Math.sin(angle));
      System.out.println("The cosine is: \t\t\t" + Math.cos(angle));
      System.out.println("The tangent is: \t\t" + Math.tan(angle));
      System.out.println();
      
      // C) Floor and ceiling values
      System.out.print("Enter a floating-point number: \t");
      float fNum = input.nextFloat();
      System.out.println("The floor is: \t\t\t" + Math.floor(fNum));
      System.out.println("The ceiling is: \t\t" + Math.ceil(fNum));
      System.out.println();
      
      // D) Number raised to a number
      System.out.print("Enter X(a floating-point number): \t");
      float x = input.nextFloat();
      System.out.print("Enter Y(a floating-point number): \t");
      float y = input.nextFloat();
      System.out.println("X raised to Y is: \t\t\t" + Math.pow(x, y));
      System.out.println();
      
      // E) Square root of an integer
      System.out.print("Enter an integer: \t\t\t");
      int sqrInt = input.nextInt();
      System.out.println("The square root of this number is: \t" + Math.sqrt(sqrInt));
      input.close();
   
   }
}
//Author:      Nick Seyler
//Date:        September 16, 2015
//Description: Gets two integers from the user and displays its sum.

import java.util.*;

public class SumException
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      boolean goAgain = true;
      int num1, num2, sum;
      
      do{   
         try
         {
            System.out.print("Enter two integers: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            sum = num1 + num2;
            
            System.out.println("Sum: " + sum);
            input.close();
            goAgain = false;
         }   
         
         //occurs when input is incorrect
         catch (InputMismatchException ex)
         {
            System.out.println("Error: Two integers are required.");
            input.nextLine();
         }
      } while (goAgain);
      
   }
}
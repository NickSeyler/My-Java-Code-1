//Author:      Nick Seyler
//Date:        Mar 9, 2015
//Description: Adds integers as input by the user.

import java.util.Scanner;

public class InputSum
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      int sum = 0;
      int numInput = 0;
      char yesOrNo = 'y';
      
      
      while (yesOrNo == 'y')
      {
         System.out.println("Enter Integers (-1 to quit):\t");
         
         while (numInput != -1) //sentinel value of -1
         {
            numInput = input.nextInt();
            sum += numInput;
         }
         sum += 1;
         System.out.println("The Sum:\t" + sum); //output
         sum = 0; 
         numInput = 0; //reset values
         
         System.out.print("Add again(y/n)? "); //confirms if the user wishes to add again
         yesOrNo = input.next().charAt(0);
      }
      input.close();
   }
}
//Author:      Nick Seyler
//Date:        Feb 4, 2015
//Description: Asks the user for an account number, service code, and amount of time the service was used, then outputs the amount due.

import java.util.Scanner;

public class PhoneBill
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      int accountNum, minutesR, minutesDay, minutesNight, totalTime;
      double total;
      String serviceCode;
      
      //get user input
      System.out.print("Enter your account number: ");
      accountNum = input.nextInt();
      System.out.print("Enter your service code: ");
      serviceCode = input.next();
      
      //checks service code
      if (serviceCode.equals("r") || serviceCode.equals("R"))
      {
         //get user input
         System.out.print("Enter the amount of minutes used: ");
         minutesR = input.nextInt();
         input.close();
         
         //calculates total cost
         if (minutesR <= 50)
         {
            total = 10;
         }
         else
         {
         total = (10 + (minutesR - 50) * 0.2);
         }
         
         //output
         System.out.println("Your account number is: " + accountNum);
         System.out.println("Your service type is: Regular");
         System.out.println("You used this service for: " + minutesR + " minutes");
         System.out.println("You owe: $" + total);
      }
      
      else if (serviceCode.equals("p") || serviceCode.equals("P"))
      {
         //get user input
         System.out.print("Enter the amount of minutes used during the day: ");
         minutesDay = input.nextInt();
         System.out.print("Enter the amound of minutes used during the night: ");
         minutesNight = input.nextInt();
         input.close();
         
         //calculates total time
         totalTime = minutesDay + minutesNight;
         
         //calculates total cost
         if (minutesDay <= 75 && minutesNight <= 100)
         {
            total = 25;
         }
         else if (minutesDay > 75 && minutesNight > 100)
         {
            total = 25 + (minutesDay - 75) * 0.1 + (minutesNight - 100) * 0.05;
         }
         else if (minutesDay > 75)
         {
            total = 25 + (minutesDay - 75) * 0.1;
         }
         else
         {
            total = 25 + (minutesNight - 100) * 0.05;
         }
         
         //output
         System.out.println("Your account number is: " + accountNum);
         System.out.println("Your service type is: Premium");
         System.out.println("You used this service for: " + totalTime + " minutes");
         System.out.println("You owe: $" + total);
      }
      else
      {
         //output
         System.out.println("Please enter a valid service code.");
      }
   }
}
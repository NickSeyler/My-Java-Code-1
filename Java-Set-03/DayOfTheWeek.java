//Author:      Nick Seyler
//Date:        Feb 9, 2015
//Description: Displays the day of the week based on the year, month, and day of the month.

import java.util.Scanner;

public class DayOfTheWeek
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      int dayOfWeek, dayOfMonth, month, year, century, yearOfCentury;
      
      //user input
      System.out.print("Enter year: (e.g., 2012): ");
      year = input.nextInt();
      System.out.print("Enter month: 1-12: ");
      month = input.nextInt();
      System.out.print("Enter the day of the month: 1-31: ");
      dayOfMonth = input.nextInt();
      input.close();
      
      //mathematical correction
      if(month == 1)
      {
         month = 13;
         year = year - 1;
      }
      else if (month == 2)
      {
         month = 14;
         year = year - 1;
      }
      
      //calculations
      century = year/100;
      yearOfCentury = year%100;
      
      dayOfWeek = (dayOfMonth + (26 * (month + 1))/10 + yearOfCentury + yearOfCentury/4 + century/4 + 5 * century) % 7;
      
      //output
      System.out.print("Day of the week is ");
      
      if (dayOfWeek == 0)
      {
         System.out.println("Saturday");
      }
      else if (dayOfWeek == 1)
      {
         System.out.println("Sunday");
      }
      else if (dayOfWeek == 2)
      {
         System.out.println("Monday");
      }
      else if (dayOfWeek == 3)
      {
         System.out.println("Tuesday");
      }
      else if (dayOfWeek == 4)
      {
         System.out.println("Wednesday");
      }
      else if (dayOfWeek == 5)
      {
         System.out.println("Thursday");
      }
      else if (dayOfWeek == 6)
      {
         System.out.println("Friday");
      }
      
   }
}
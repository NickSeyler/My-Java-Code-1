//Author:      Nick Seyler
//Date:        Apr 12, 2015
//Description: Reads 10 integers and counts the occurences of the integers.
import java.util.Scanner;

public class CountOccurences
{
   public static void main(String [] args)
   {
      char again = 'n';
   
      Scanner input = new Scanner(System.in);
      do
      {
         run();
         System.out.print("Do you want to run again? (y) ");
         again = input.nextLine().charAt(0);
      } while (again == 'y');
      input.close();
   }
   
   public static void run()
   {
      Scanner input = new Scanner(System.in);
      
      //get user input
      int[] numbers = new int[10];
      System.out.print("Enter ten integers between 1 and 100: ");
      for (int i = 0; i < numbers.length; i++)
         numbers[i] = input.nextInt();
      
      //iterate through each number from 1-100 and count how often they occur
      for (int i = 1; i <= 100; i++)
      {
         int count = 0;
         for (int j = 0; j < numbers.length; j++)
         {
            if (i == numbers[j])
               count++;
         }
         
         //display a message if their count is more than 0
         if (count != 0)
         {
            if (count > 1)
               System.out.println(i + " occurs " + count + " times");
            else
               System.out.println(i + " occurs " + count + " time");
         }
      }
      
   }
}
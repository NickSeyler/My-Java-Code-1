//Author:      Nick Seyler
//Date:        Apr 12, 2015
//Description: Sort names into alphabetical order.
import java.util.Scanner;

public class SortStrings
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
      System.out.print("Enter the size of the list: ");
      int size = input.nextInt();
      String[] list = new String[size];
      
      //get user input
      for (int i = 0; i < list.length; i++)
      {
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter item " + (i+1) + ": ");
         list[i] = scan.nextLine();
      }
      
      System.out.print("List before sorting: ");
      for (int i = 0; i <list.length; i++)
      {
         if (i != list.length - 1)
            System.out.print(list[i] + ", ");
         else
            System.out.println(list[i]);
         
      }
      
      selectionSort(list);
      
      
   }
   
   // sort a list of strings using selection sort
   public static void selectionSort(String[] list)
   {
      for (int i = 0; i < list.length - 1; i++)
      {
         String currentMinString = list[i];
         int currentMinIndex = i;
         
         for (int j = i + 1; j < list.length; j++)
         {
            if(currentMinString.charAt(0) > list[j].charAt(0))
            {
               currentMinString = list[j];
               currentMinIndex = j;
            }
         }
         
         if (currentMinIndex != i)
         {
            list[currentMinIndex] = list[i];
            list[i] = currentMinString;
         }
      }
      
      System.out.print("List after sorting: ");
      for (int i = 0; i <list.length; i++)
      {
         if (i != list.length - 1)
            System.out.print(list[i] + ", ");
         else
            System.out.println(list[i]); 
      }

   }
}
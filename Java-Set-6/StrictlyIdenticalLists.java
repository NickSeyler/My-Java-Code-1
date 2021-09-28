//Author:      Nick Seyler
//Date:        Apr 12, 2015
//Description: Determines if two integer arrays are strictly identical.
import java.util.Scanner;

public class StrictlyIdenticalLists
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
      System.out.print("Enter list1: ");
      int size1 = input.nextInt();
      
      int[] list1 = new int[size1];
      
      for (int i = 0; i < list1.length; i++)
      {
         list1[i] = input.nextInt();
      }
      
      
      System.out.print("Enter list2: ");
      int size2 = input.nextInt();
      
      int[] list2 = new int[size2];
      
      for (int i = 0; i < list2.length; i++)
      {
         list2[i] = input.nextInt();
      }
      
      boolean isEqual = equals(list1, list2);
      if (isEqual)
         System.out.println("The two lists are strictly identical.");
      else
         System.out.println("The two lists are not strictly identical.");
   }
   
   //check if 2 lists are strictly identical
   public static boolean equals(int[] list1, int[] list2)
   {
      if (list1.length != list2.length)
         return false;
      
      for (int i = 0; i < list1.length; i++)
         if (list1[i] != list2[i])
            return false;
      
      return true;
      
   }
}
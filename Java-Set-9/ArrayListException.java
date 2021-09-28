//Author:      Nick Seyler
//Date:        September 16, 2015
//Description: 

import java.util.*;

public class ArrayListException
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> list = new ArrayList<>();
      int index = 0;
      
      //adds a random integer from 1-100 100 times.
      for (int i = 0; i < 100; i++)
      {
         list.add((int)(Math.random() * 101));
      }
      
      while (index != -1)
      {
         try
         {
            System.out.print("Enter an index integer(-1 to exit): ");
            index = input.nextInt();
            
            if (index == -1)
            {
               //loop ends
            }
            
            else
            {
               input.close();
               System.out.println("The element in " + index + " is " + list.get(index));
            }
         }
         
         catch (IndexOutOfBoundsException ex)
         {
            System.out.println("Out of Bounds.");
         }
      }
      
      
   }
}
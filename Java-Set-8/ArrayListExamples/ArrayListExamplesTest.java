//Author:      Nick Seyler
//Date:        September 10, 2015
//Description: Tests the max method in the ArrayListMaxInteger class and displays the largest integer.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamplesTest
{
   public static void main(String [] args)
   {
	   testMaxInt();
	   testSum();
	   testUnion();
   }
   
   private static void testMaxInt() 
   {
	   ArrayList<Integer> list = new ArrayList<>();
	   int num;
	      
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter integers (input ends in zero, cannot contain zero elsewhere):");
	   
	   do {
	      num = input.nextInt(); //take a value
	         
	      if (!list.contains(num) && num != 0) 
	         list.add(num); // adds that value if it is not in the list and is not 0
	      } while (num != 0); // ends when it reaches 0
	         
	   System.out.println("The largest integer is: " + ArrayListExamples.max(list));
   }
   
   private static void testSum()
   {
	   ArrayList<Integer> list = new ArrayList<>();
	   int num;
	   
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter 5 numbers: ");
	   
	   do {
	      num = input.nextInt();
	      list.add(num);
	   }  while (list.size() != 5 );
	   
	   System.out.println("The sum is: " + ArrayListExamples.sum(list));
   }
   
   public static void testUnion()
   {
      ArrayList<Integer> list1 = new ArrayList<>();
      ArrayList<Integer> list2 = new ArrayList<>();
      int num;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter five integers for list1: ");
      do {
         num = input.nextInt();
         list1.add(num);
      }  while (list1.size() != 5);
      
      System.out.println("Enter five integers for list2: ");
      do {
         num = input.nextInt();
         list2.add(num);
      }  while (list2.size() != 5);
            
      System.out.print("The combined list is:");
      
      for (int i = 0; ArrayListExamples.union(list1, list2).size() > i; i++)
      {
         System.out.print(" " + ArrayListExamples.union(list1, list2).get(i));
      }
   }
}


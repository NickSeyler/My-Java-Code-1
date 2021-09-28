//Author:      Nick Seyler
//Date:        September 10, 2015
//Description: Tests the MyStack class by inputting five strings and outputting them in reverse order

import java.util.Scanner;

public class MyStackTest
{
   public static void main(String [] args)
   {
      MyStack list = new MyStack();
      MyStack reverseList = new MyStack();
      String s;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter five Strings: ");
      
      do {
         s = input.next();
         list.add(s);
      } while (list.getSize() != 5);
      input.close();
      
      
      while (list.getSize() != 0)
      {
         reverseList.add(list.pop());
      }
      
      System.out.println(reverseList.toString());
   }
}

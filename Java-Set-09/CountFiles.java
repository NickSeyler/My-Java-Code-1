//Author:      Nick Seyler
//Date:        October 31, 2015
//Description: Finds the number of files in a user-specified directory.

import java.io.File;
import java.util.Scanner;

public class CountFiles
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a directory: ");
      String dir = input.nextLine();
      
      System.out.println("The number of files in " + dir + " is " + (getFileTotal(new File(dir))) );
   }
   
   public static int getFileTotal(File file)
   {
      int count = 0;
      
      if (file.isDirectory())
      {
         File [] files = file.listFiles();
         for (int i = 0; files != null && i < files.length; i++)
            count += getFileTotal(files[i]);
      }
      
      //base case
      else
      {
         count += 1;
      }
      
      return count;
   }
}
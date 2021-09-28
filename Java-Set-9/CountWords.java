//Author:      Nick Seyler
//Date:        September 22, 2015
//Description: Counts the number of words in a text file on a website

import java.util.Scanner;
import java.net.*;
import java.io.*;

public class CountWords
{
   public static void main(String [] args) throws Exception
   {
      try
      {
         URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
         int words = 0;
         Scanner input = new Scanner(url.openStream());
         while(input.hasNext())
         {
            String line = input.next();
            words++;
         }
         
         System.out.println("The amount of words in the file is: " + words);
         
      }
      catch (MalformedURLException ex)
      {
         System.out.println("Invalid URL.");
      }
      catch (IOException ex)
      {
         System.out.println("I/O Errors: File does not exist.");
      }
   }
}
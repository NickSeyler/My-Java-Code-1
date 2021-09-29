//Author:      Nick Seyler
//Date:        September 21, 2015
//Description: Counts the number of occurences of a character in a String.

public class CountCharacters
{
   private static int incr;
   
   public static int count(String str, char a)
   {
      if (str.length() > 0)
         if (str.charAt(str.length() - 1) == a)
         {
            incr ++;
            count (str.substring(0, str.length() - 1), a);
         }
         
      else
         count (str.substring(0, str.length() - 1), a);
            
      return incr;
   }
}
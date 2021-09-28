//Author:      Nick Seyler
//Date:        Mar 21, 2015
//Description: Displays the first 100 palindromic prime numbers.

public class PalindromicPrime
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      int count = 0;
      for (int num = 0; count != 100; num++)
      {
         if (isPalindrome(num) && isPrime(num))
         {
            count += 1;
            if (count % 10 == 0)
               System.out.println(num);
            else
               System.out.print(num + " ");
         }
      }
      
   }
   
   //checks if a number is a palindrome
   public static boolean isPalindrome(int num)
   {
      String numStr = num + "";
      if (numStr.length() == 1) //1-digit numbers
      {
         return true;
      }
      else if (numStr.length() == 2) //2-digit numbers
      {
         if (num % 10 == num / 10) //1st digit = 2nd digit
            return true;
         else
            return false;
      }
      else if (numStr.length() == 3) // 3-digit numbers
      {
         if (num % 10 == num / 100) //1st digit = 3rd digit
            return true;
         else
            return false;
      }
      else if (numStr.length() == 4) // 4-digit numbers
      {
         if (num % 10 == num / 1000 && num / 10 % 10 == num / 100 % 10) //1st digit = 4th digit & 2nd digit = 3rd digit
            return true;
         else
            return false;
      }
      else if (numStr.length() == 5) // 5-digit numbers
      {
         if (num % 10 == num / 10000 && num / 10 % 10 == num / 1000 % 10) //1st digit = 5th digit & 2nd digit = 4th digit
            return true;
         else
            return false;
      }
      
      return true;
      
      
   }
   
   //checks if a number is prime
   public static boolean isPrime(int num)
   {
      if (num == 0 || num == 1)
         return false;
         
      for (int i = 2; i < num; i++)
         if (num % i == 0)
            return false;
            
      return true;
   }
}
//Author:      Nick Seyler
//Date:        Mar 9, 2015
//Description: Uses one while loops to determine even and odd numbers between 50 and 100.

public class EvenOdd
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variable
      int num = 50;
      int i = 0;
      
      System.out.print("Even numbers between 50 and 100: "); //output
      
      while (num <= 102 && i <=100)
      {
         //if statement for even numbers
         if (num % 2 == 0 && num != 100 && num !=102) //checks for even num, cannot be 100 or 102
         {
            System.out.print(num + ", ");
            num++; //increment + 1
         }
         else if (num == 100) //removes unnecessary comma
         {
            System.out.print(num + "\n");
            num++; //increment +1
            i = 49; //allows calculation for odd numbers
         }
         else if (num != 102)//num is odd, prevents num from incrementing past 102
         {
            num++; //increment + 1
         }
         
         
         if (i == 49) //if statement to start a new output line
         {
            System.out.print("Odd numbers between 50 and 100:  "); //output
            i++; //increment + 1
         }
         //if statement for odd numbers
         if (i >= 50) //prevents calculations until even number checks are complete
         {
            if (i % 2 == 1 && i != 99) //checks for odd num
            {
               System.out.print(i + ", ");
            }
            else if (i == 99) //removes unnecessary comma
            {
               System.out.print(i);
            }
            i++; //increment + 1 on all iterations
         }
      }
   }
}
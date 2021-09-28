//Author:      Nick Seyler
//Date:        Mar 9, 2015
//Description: Uses nested loops to create two patterns.

public class Diamonds
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
  {
      int firstHalf = 1;
      while (firstHalf <= 5) //first 5 rows
      {
         System.out.print("      ");//creates a row of spaces
         
         int space1 = 4;
         while (space1 >= firstHalf)
         {
            System.out.print(" "); //creates spaces based on row
            space1 --;
         }
         
         int star1 = 1;
         while (star1 <= (firstHalf * 2) -1)
         {
            System.out.print("*"); //creates stars based on row
            star1 ++;
         }
         
         int space2 = 4;
         while (space2 >= firstHalf)
         {
            System.out.print(" "); //creates spaces based on row
            space2 --;
         }
         
         System.out.print("      ");//creates a row of spaces
         
         int space3 = 0;
         while (space3 <= firstHalf)
         {
            System.out.print(" "); //creates spaces based on row
            space3 ++;
         }
         
         int star2 = 9;
         while (star2 >= (firstHalf * 2) -1)
         {
            System.out.print("*"); //creates stars based on row
            star2 --;
         }
         
         System.out.print("\n"); //new row
         firstHalf ++;
      }
      
      int secondHalf = 1;
      while (secondHalf <= 4) //last 4 rows
      {
         System.out.print("      ");//creates a row of spaces
         
         int space4 = 1;
         while (space4 <= secondHalf )
         {
            System.out.print(" "); //creates spaces based on row
            space4 ++;
         }
         
         int star3 = 7;
         while (star3 >= (secondHalf * 2) -1)
         {
            System.out.print("*"); //creates stars based on row
            star3 --;
         }
         
         int space5 = 1;
         while (space5 <= secondHalf )
         {
            System.out.print(" "); //creates spaces based on row
            space5 ++;
         }
         
         System.out.print("       ");//creates a row of spaces
         
         int space6 = 4;
         while (space6 >= secondHalf)
         {
            System.out.print(" "); //creates spaces based on row
            space6 --;
         }
         
         int star4 = 1;
         while (star4 <= (secondHalf * 2) + 1)
         {
            System.out.print("*"); //creates stars based on row
            star4 ++;
         }
         
         
         
         System.out.print("\n"); //new row
         secondHalf++;
      }
      
      
   }
}
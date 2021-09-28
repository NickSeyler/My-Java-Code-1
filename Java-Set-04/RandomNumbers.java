//Author:      Nick Seyler
//Date:        Feb 18, 2015
//Description: Various examples of random number generation.

public class RandomNumbers
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      System.out.println("A random integer between 30 and 50: \t\t\t" + (int)((Math.random() * 21) + 30));                  // A) generate a random integer between 30 and 50
      System.out.println("A random integer between -20 and 20: \t\t\t" + (int)((Math.random() * 41) - 20));                 // B) generate a random integer between -20 and 20
      System.out.println("A random integer between -60 and -20: \t\t\t" + (int)((Math.random() * 41) - 60));                // C) generate a random integer between -60 and -20
      System.out.printf("A random floating-point number between 0 and 15.999: \t%6.4f" , (float)(Math.random() * 16));  // D) generate a random floating-point number between 0 and 15.9999
   }
}
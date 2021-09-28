//Author:      Nick Seyler
//Date:        Mar 24, 2015
//Description: Displays a table for the conversion from feet to meters and meters to feet.

public class FeetMeters
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables
      double foot = 1;
      double meter = 20;
      
      System.out.printf("Feet%12s%6s%12s%13s\n", "Meters", "|", "Meters", "Feet"); //output with formatting
      
      //performs output ten times
      while (foot <= 10)
      {
         //if else used to format
         if (foot == 10)
            System.out.printf(foot + "%11.3f%7s%12.1f%13.3f\n", footToMeter(foot), "|", meter, meterToFoot(meter));
         else
            System.out.printf(foot + "%12.3f%7s%12.1f%13.3f\n", footToMeter(foot), "|", meter, meterToFoot(meter));
            
         foot += 1;
         meter += 5;
      }
   }
   
   //converts from feet to meters
   public static double footToMeter(double foot)
   {
      double meter = 0.305 * foot;
      return meter;
   }
   
   //converts from meters to feet
   public static double meterToFoot(double meter)
   {
      double foot = 3.279 * meter;
      return foot;
   }
}
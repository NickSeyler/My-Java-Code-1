//Author:      Nick Seyler
//Date:        Aug 20, 2015
//Description: Tests the Time class by creating two Time objects and displaying the time in the h:m:s format.

public class TimeTest
{
   public static void main(String[] args)
   {
      //construct Times
      Time t1 = new Time();
      Time t2 = new Time(555550000);
      
      System.out.println(t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond() );
      System.out.println(t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond() );
   }
}
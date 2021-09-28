//Author:      Nick Seyler
//Date:        Aug 20, 2015
//Description: The Time class, which can construct time values and display time.

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Time
{
   //members
   private int hour;
   private int minute;
   private int second;
   
   //constructors
   public Time()
   {
      convertTime(System.currentTimeMillis());
   }
   
   public Time(long t)
   {
      convertTime(t);
   }
   
   public Time (int h, int m, int s)
   {
      hour = h;
      minute = m;
      second = s;
   }
   
   //getters
   public int getHour()
   {
      return hour;
   }
   
   public int getMinute()
   {
      return minute;
   }
   
   public int getSecond()
   {
      return second;
   }
   
   public void setTime(long elapsedTime)
   {
      convertTime(elapsedTime);
   }
   
   //converts a long into a time object
   private void convertTime(long t)
   {
      GregorianCalendar gc = new GregorianCalendar();
      gc.setTimeInMillis(t);
      
      hour = gc.get(Calendar.HOUR);
      minute = gc.get(Calendar.MINUTE);
      second = gc.get(Calendar.SECOND);
   }
}
//Author:      Nick Seyler
//Date:        Apr 28, 2015
//Description: The Fan class.

public class Fan
{
   final static int SLOW = 1;
   final static int MEDIUM = 2;
   final static int FAST = 3;
   private int speed;
   private boolean on;
   private double radius;
   String color;
   
   public int getSpeed()
   {
      return speed;
   }
   
   public boolean isOn()
   {
      return on;
   }
   
   public double getRadius()
   {
      return radius;
   }
   
   public String getColor()
   {
      return color;
   }
      
   public void setSpeed(int newSpeed)
   {
      speed = newSpeed;
   }
   
   public void setOn(boolean newOn)
   {
      on = newOn;
   }
   
   public void setRadius(double newRadius)
   {
      radius = newRadius;
   }
      
   public void setColor(String newColor)
   {
      color = newColor;
   }
   
   Fan()
   {
      speed = SLOW;
      on = false;
      radius = 5;
      color = "blue";
   }
   
   public String toString()
   {
      if (on)
         return "This fan's speed is " + speed + ", the color is " + color + ", and the radius is " + radius + ".";
      else
         return "This fan's color is " + color + ", the radius is " + radius + ", and the fan is off.";
   }     
}

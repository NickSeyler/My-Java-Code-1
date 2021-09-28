//Author:      Nick Seyler
//Date:        Apr 23, 2015
//Description: The Rectangle class.

public class Rectangle
{
   double width;
   double height;
   
   Rectangle()
   {
      width = 1;
      height = 1;
   }
   
   Rectangle(double w, double h)
   {
      width = w;
      height = h;
   }
   
   public double getArea()
   {
      return width * height;
   }
   
   public double getPerimeter()
   {
      return (width + height) * 2;
   }
}

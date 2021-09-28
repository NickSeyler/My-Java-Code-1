//Author:      Nick Seyler
//Date:        Aug 25, 2015
//Description: Triangle class

public class Triangle extends GeometricObject
{
   private static double _side1;
   private static double _side2;
   private static double _side3;
   
   public Triangle()
   {
      super(); //similar to a new GeometricObject
      _side1 = 1;
      _side2 = 1;
      _side3 = 1;
   }
   
   public Triangle(double s1, double s2, double s3)
   {
      super();
      _side1=s1;
      _side2=s2;
      _side3=s3;
   }
   
   public double getSide1()
   {
      return _side1;
   }
   
   public double getSide2()
   {
      return _side2;
   }
   
   public double getSide3()
   {
      return _side3;
   }
   
   public double getArea()
   {
      double s = (_side1 + _side2 + _side3)/2;
      double area = Math.sqrt(s *(s - _side1) * (s - _side2) * (s - _side3));
      return area;
   }
   
   public double getPerimeter()
   {
      return _side1 + _side2 + _side3;
   }
   
   //overriding
   public String toString()
   {
      return "Triangle: side1 = " + _side1 + ", side2 = " + _side2 + ", side3 = " + _side3 + super.toString();
   }
}
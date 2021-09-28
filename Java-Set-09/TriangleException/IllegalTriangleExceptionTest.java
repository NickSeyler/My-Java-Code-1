//Author:      Nick Seyler
//Date:        Sept 16, 2015
//Description: Tests the IllegalTriangleException class 

public class IllegalTriangleExceptionTest
{
   public static void main(String [] args)
   {
      try
      {
         new Triangle(1, 5, 99);
      }
      
      catch (IllegalTriangleException ex)
      {
         System.out.println(ex);
      }
   }
}
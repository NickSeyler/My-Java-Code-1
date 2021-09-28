//Author:      Nick Seyler
//Date:        Sept 16, 2015
//Description: The IllegaltriangleException class, whose constructor is invoked by the Triangle constructor.

public class IllegalTriangleException extends Exception
{
   public IllegalTriangleException(String s)
   {
      super(s);
   }
}
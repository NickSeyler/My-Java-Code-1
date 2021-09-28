//Author:      Nick Seyler
//Date:        Aug 25, 2015
//Description: Geometric class

import java.util.Date;

public class GeometricObject
{
   private String _colorStr;
   private boolean _filled;
   private Date _dateCreated;
   
   public GeometricObject()
   {
      _colorStr = "white";
      _filled = false;
      _dateCreated = new Date();
   }
   
   public GeometricObject(String cStr, boolean f)
   {
      _colorStr = cStr;
      _filled = f;
      _dateCreated = new Date();
   }
   
   public String getColorStr()
   {
      return _colorStr;
   }
   
   public void setColor(String cStr)
   {
      _colorStr = cStr;
   }
   
   public boolean isFilled()
   {
      return _filled;
   }
   
   public void setFilled(boolean f)
   {
      _filled = f;
   }
   
   public Date getDateCreated()
   {
      return _dateCreated;
   }
   
   public String toString()
   {
      return "\nCreated on " + _dateCreated + "\nColor: " + _colorStr + " and Filled: " + _filled;
   }
}

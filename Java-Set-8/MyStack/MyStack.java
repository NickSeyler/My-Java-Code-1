//Author:      Nick Seyler
//Date:        September 10, 2015
//Description: Implements the MyStack class using inheritance

import java.util.ArrayList;

public class MyStack extends ArrayList
{
   public int getSize()
   {
      return size();
   }
   
   public Object peek()
   {
      return get(getSize()-1);
   }
   
   public Object pop()
   {
      Object o = get(getSize() - 1);
      remove(getSize() - 1);
      return o;
   }
   
   public void push(Object o)
   {
      add(o);
   }
   
   @Override
   public String toString()
   {
      return "stack: " + super.toString();
   }
}

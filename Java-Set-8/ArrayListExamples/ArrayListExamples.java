//Author:      Nick Seyler
//Date:        September 10, 2015
//Description: Examples of array lists.

import java.util.ArrayList;

public class ArrayListExamples
{
	public static Integer max(ArrayList<Integer> intList)
	   {
	      Integer maxInt = intList.get(0); //initialization
	      
	      if (intList == null || intList.size() == 0)
	         return null;
	         
	      else
	         for(int i = 0; intList.size() > i; i++)
	            {
	               if (intList.get(i) > maxInt)
	               maxInt = intList.get(i);
	            }
	         return maxInt;
	   }
	
	public static int sum(ArrayList<Integer> list)
	   {
	      int sum = 0;
	      
	      if (list == null || list.size() == 0)
	         return 0;
	         
	      else
	         for(int i = 0; list.size() > i; i++)
	            {
	               sum += list.get(i);
	            }
	         return sum;
	   }
	
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
	   {
	      ArrayList<Integer> list3 = new ArrayList<>(); //prevents original ArrayLists from being modified
	      
	      for (int i = 0; i < list1.size(); i++)
	      {
	         list3.add(list1.get(i));
	      }
	      
	      for (int i = 0; i < list2.size(); i++)
	      {
	         list3.add(list2.get(i));
	      }
	      
	      return list3;
	   }
}

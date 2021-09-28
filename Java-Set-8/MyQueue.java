//Author:      Nick Seyler
//Date:        Aug 23, 2015
//Description: The Queue class, which constructs and can simulate a queue.

public class MyQueue
{
   //members
   private int[] elements;
   private int size;
   public static final int DEFAULT_CAPACITY = 8;
   
   //constructor
   public MyQueue()
   {
      elements = new int[DEFAULT_CAPACITY];
   }
   
   //adds an integer to the queue
   public void enqueue(int v)
   {
      if (size >= elements.length)
      {
         int[] temp = new int[elements.length * 2];
         System.arraycopy(elements, 0, temp, 0, elements.length);
         elements = temp;
      }
      
      elements[size++] = v;
   }
   
   //removes and returns the integer in the queue, shifts elements down the queue
   public int dequeue()
   {
      int returned = elements[0];
      
      for (int i = 0; i < elements.length - 1; i++)
      {
         elements[i] = elements[i+1];
      }

      size--;
      
      return returned;
   }
   
   //checks if the queue is empty
   public boolean empty()
   {
      if (size == 0)
         return true;
      return false;
   }
   
   //getter
   public int getSize()
   {
      return size;
   }
}
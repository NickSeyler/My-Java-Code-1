//Author:      Nick Seyler
//Date:        Aug 23, 2015
//Description: Tests the queue class by constructing a queue, adding 20 numbers to the queue, then removing and displaying those numbers

public class MyQueueTest
{
   public static void main(String[] args)
   {
      MyQueue q1 = new MyQueue();
      
      for (int i = 1; i <= 20; i++)
         q1.enqueue(i);
      
      while (q1.getSize() != 0)
         System.out.print(q1.dequeue() + " ");
   }
}

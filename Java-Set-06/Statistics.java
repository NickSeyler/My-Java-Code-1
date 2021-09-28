//Author:      Nick Seyler
//Date:        Apr 12, 2015
//Description: Compute the mean and deviation of 10 numbers.

import java.util.Scanner;

public class Statistics
{
   public static void main(String [] args)
   {
      char again = 'n';
   
      Scanner input = new Scanner(System.in);
      do
      {
         run();
         System.out.print("Do you want to run again? (y) ");
         again = input.nextLine().charAt(0);
      } while (again == 'y');
      input.close();
   }
   
   public static void run()
   {
      Scanner input = new Scanner(System.in);
      
      //get user input
      double[] numbers = new double[10];
      System.out.print("Enter ten numbers: ");
      for (int i = 0; i < numbers.length; i++)
         numbers[i] = input.nextDouble();
         
      double mean = mean(numbers);
      System.out.printf("The mean is %4.2f\n", mean);
      
      double deviation = deviation(numbers, mean);
      System.out.printf("The deviation is %7.5f \n", deviation);
   }
   
   //get the mean of the numbers
   public static double mean(double[] x)
   {
      double total = 0;
      
      for (int i = 0; i < x.length; i++)
         total += x[i];
      
      total = total / x.length;
      return total;   
   }
   
   //get the standard deviation of the numbers
   public static double deviation(double[] x, double mean)
   {
      double sum = 0;
      for (int i = 0; i < x.length; i++)
         sum = sum + Math.pow(x[i] - mean, 2);
      
      double deviation = sum / (x.length - 1);
      deviation = Math.sqrt(deviation);   
      
      return deviation;
   }
}
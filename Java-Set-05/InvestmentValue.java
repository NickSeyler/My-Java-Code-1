//Author:      Nick Seyler
//Date:        Mar 17, 2015
//Description: Display interest over a course of thirty years.

import java.util.Scanner;

public class InvestmentValue
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      Scanner input = new Scanner(System.in);
      
      //user input
      System.out.print("Enter amount invested in dollars and cents: ");
      double investmentAmount = input.nextDouble();
      System.out.print("Enter the annual interest rate in percent: ");
      double yearlyInterestRatePercent = input.nextDouble();
      input.close();
      
      //yearly to monthly calculation
      double monthlyInterestRate = yearlyInterestRatePercent/100/12;
      
      //output
      System.out.printf("Years %17s", "Future Value\n");
      
      //performs futureInvestmentValue method 30 times
      for (int i = 1; i <= 30; i++)
      {
         futureInvestmentValue(investmentAmount, monthlyInterestRate, i);
      }
   }
   
   public static void futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
   {
      //calculate
      double total = investmentAmount * Math.pow(1 + monthlyInterestRate, years*12);
      
      //proper spacing
      if (years < 10)
      {
         System.out.printf(years + "%21.2f\n", total);
      }
      else
      {
         System.out.printf(years + "%20.2f\n", total);
      }
   }
}
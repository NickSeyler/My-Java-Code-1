//Author:      Nick Seyler
//Date:        Feb 18, 2015
//Description: Prints a payroll statement based on user input.

import java.util.Scanner;

public class Payroll
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      String name;
      float workHours, payRate, fedTax, stateTax, fedWithold, stateWithold, totalDeduction, grossPay, netPay, fedTaxPercent, stateTaxPercent;
      
      //user input
      System.out.print("Enter employee's name:\t\t\t");
      name = input.nextLine();
      System.out.print("Enter number of hours worked in a week:\t");
      workHours = input.nextFloat();
      System.out.print("Enter hourly pay rate:\t\t\t");
      payRate = input.nextFloat();
      System.out.print("Enter federal tax witholding rate:\t");
      fedTax = input.nextFloat();
      System.out.print("Emter state tax withholding rate:\t");
      stateTax = input.nextFloat();
      input.close();
      
      //calculations
      grossPay = workHours * payRate;
      fedTaxPercent = (fedTax * 100);
      stateTaxPercent = (stateTax * 100);
      fedWithold = grossPay * fedTax;
      stateWithold = grossPay * stateTax;
      totalDeduction = fedWithold + stateWithold;
      netPay = grossPay - totalDeduction;
      
      //output
      System.out.println();
      System.out.println("Employee Name: \t" + name);
      System.out.println("Hours Worked: \t" + workHours);
      System.out.printf("Pay Rate: \t$%4.2f\n" , payRate);
      System.out.printf("Gross Pay: \t$%4.2f\n" , grossPay);
      System.out.println("Deductions: ");
      
      System.out.printf("  Federal Witholding (%3.1f" , fedTaxPercent);
      System.out.print("%): \t$");
      System.out.printf("%4.2f\n" , fedWithold);
      
      System.out.printf("  State Witholding (%3.1f" , stateTaxPercent);
      System.out.print("%): \t$");
      System.out.printf("%4.2f\n" , stateWithold);
      
      System.out.printf("  Total Deduction: \t\t$%4.2f\n" , totalDeduction);
      System.out.printf("Net Pay: \t$%4.2f" , netPay);
      
   }
}
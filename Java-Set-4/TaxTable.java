//Author:      Nick Seyler
//Date:        Mar 19, 2015
//Description: Generates a tax table for taxable income between $50,000 - $60,000 per 50 dollars.

public class TaxTable
{
   public static void main(String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //output, formatting
      System.out.printf("Taxable %12s%20s%14s%15s","Single","Married Joint","Married","Head of\n");
      System.out.printf("Income  %32s%15s%13s","or Qualifying","Separate","a House\n");
      System.out.printf("%38s","Widow(er)\n\n");
      
      //declare and assign variable
      int taxableIncome = 50000;
      
      while (taxableIncome <=60000)
      {
         //calculates same income value for all statuses
         double tax1 = Math.round(computeTax(1, taxableIncome));
         double tax2 = Math.round(computeTax(2, taxableIncome));
         double tax3 = Math.round(computeTax(3, taxableIncome));
         double tax4 = Math.round(computeTax(4, taxableIncome));
         
         //output, formatting
         System.out.printf(taxableIncome + "%13.0f%13.0f%20.0f%13.0f \n", tax1, tax2, tax3, tax4);
         
         taxableIncome += 50;//increment + 50
      }
   }
   
   public static double computeTax(int status, double taxableIncome)
   {
      //variable initialization
      double tax = 0;
      
      //formulas
      if (status == 1 || status == 3)
      {
         tax = 8350 * .10 + (33950 - 8350) * .15 + (taxableIncome - 33950) * .25;
      }
      else if (status == 2)
      {
         tax = 16700 * .10 + (taxableIncome - 16700) * .15;
      }
      else if (status == 4)
      {
         tax = 11950 * .10 + (45500 - 11950) * .15 + (taxableIncome - 45500) * .25;
      }
      
      //returns a double
      return tax;
   }
}
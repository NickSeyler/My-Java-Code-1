//Author:      Nick Seyler
//Date:        Apr 28, 2015
//Description: Tests the Account class.

public class AccountTest
{
   public static void main (String [] args)
   {
      Account acct = new Account(1122, 20000);
      acct.setAnnualInterestRate(4.5);
      acct.withdraw(2500);
      acct.deposit(3000);
      
      System.out.println("Balance = $" + acct.getBalance());
      System.out.println("Monthly Interest = $" + acct.getMonthlyInterest());
      System.out.println("Date = " + acct.getDate());
      System.out.println();
      System.out.println(acct.toString());
   }
}
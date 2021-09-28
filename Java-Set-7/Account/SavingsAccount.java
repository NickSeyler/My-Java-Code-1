//Author:      Nick Seyler
//Date:        September 10, 2015
//Description: SavingsAccount, a subclass of Account

public class SavingsAccount extends Account
{
   SavingsAccount()
   {
   }
   
   SavingsAccount(int newID, double newBalance, double newAnnualInterestRate)
   {
      setID(newID);
      setBalance(newBalance);
      setAnnualInterestRate(newAnnualInterestRate);
   }
}
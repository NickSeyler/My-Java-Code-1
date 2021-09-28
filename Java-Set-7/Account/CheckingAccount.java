//Author:      Nick Seyler
//Date:        September 10, 2015
//Description: CheckingAccount, a subclass of Account; has overdraft limit

public class CheckingAccount extends Account
{
   CheckingAccount()
   {
   }
   
   CheckingAccount(int newID, double newBalance, double newAnnualInterestRate)
   {
      setID(newID);
      setBalance(newBalance);
      setAnnualInterestRate(newAnnualInterestRate);
   }
   
   @Override
   public void withdraw(double money)
   {
      if (getBalance() - money < 0)
         System.out.println("You will overdraw with this amount. Transaction cancelled.");
      else
         setBalance(getBalance() - money);
   }
}
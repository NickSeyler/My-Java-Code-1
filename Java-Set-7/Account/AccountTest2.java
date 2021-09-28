//Author:      Nick Seyler
//Date:        September 10, 2015
//Description: Tests Account, SavingsAccount, and Checking account by creating their respective objects and invoking each toString method

public class AccountTest2
{
   public static void main(String [] args)
   {
      Account account = new Account(1001, 100.00);
      SavingsAccount sAccount = new SavingsAccount(9557, 500.00, 0.03);
      CheckingAccount cAccount = new CheckingAccount(1234, 146.75, 0.06);
      
      System.out.println(account.toString() + "\n");
      System.out.println(sAccount.toString() + "\n");
      System.out.println(cAccount.toString());
   }
}